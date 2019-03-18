package com.duan.dormitorysystem.async;


import com.duan.dormitorysystem.service.inter.JedisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class MessageConsumer implements InitializingBean, ApplicationContextAware {
    private static final Logger logger = LoggerFactory.getLogger(MessageConsumer.class);
    private ApplicationContext applicationContext;

    @Autowired
    JedisService jedisService;

    @Autowired
    MessageHandler messageHandler;

    public void afterPropertiesSet() throws Exception {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                while(true) {
                        List<String> message = (List<String>)jedisService.rpopValue();
                        System.out.println(message.get(0));
                        messageHandler.createMessage(message.get(1));
                    }
                }
        });
        thread.start();
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
