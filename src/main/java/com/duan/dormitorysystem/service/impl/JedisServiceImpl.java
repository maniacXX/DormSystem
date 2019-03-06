package com.duan.dormitorysystem.service.impl;

import com.duan.dormitorysystem.service.inter.JedisService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import static com.duan.dormitorysystem.util.SerializeUtil.serialize;

/**
 * @author Duan
 * @date 2018/6/28 13:31
 */

@Service
public class JedisServiceImpl implements JedisService {

    // 映射redis配置文件
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext-Redis.xml");

    /**
     * 保存键值对到redis（值为字符串）
     * @param key 键
     * @param value 值
     */
    public void setString(String key, String value) {
        // 定义redis连接池
        JedisPool jedisPool = null;
        // 定义redis实例
        Jedis jedis = null;
        try {
            // 获取redis连接池
            jedisPool = (JedisPool) applicationContext.getBean("jedisPool");
            // 获取redis实例
            jedis = jedisPool.getResource();
            jedis.set(key.getBytes(),value.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 释放资源
            free(jedis);
        }
    }

    /**
     * 保存键值对到redis（值为对象）
     * @param key 键
     * @param value 值
     */
    public void setObject(String key, Object value) {
        // 定义redis连接池
        JedisPool jedisPool = null;
        // 定义redis实例
        Jedis jedis = null;
        try {
            // 获取redis连接池
            jedisPool = (JedisPool) applicationContext.getBean("jedisPool");
            // 获取redis实例
            jedis = jedisPool.getResource();
            jedis.set(key.getBytes(),serialize(value));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 释放资源
            free(jedis);
        }
    }

    /**
     * 获得redis中的值,值为字符串
     * @param key 键
     * @return 值
     */
    public String getString(String key) {
        // 定义redis连接池
        JedisPool jedisPool = null;
        // 定义redis实例
        Jedis jedis = null;
        try {
            // 获取redis连接池
            jedisPool = (JedisPool) applicationContext.getBean("jedisPool");
            // 获取redis实例
            jedis = jedisPool.getResource();
            if(jedis.exists(key.getBytes())) {
                return new String(jedis.get(key.getBytes()));
            }else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 释放资源
            free(jedis);
        }
        return null;
    }

    /**
     * 获得redis中的值,值为对象
     * @param key 键
     * @return 值
     */
    public Object getObject(String key) {
        // 定义redis连接池
        JedisPool jedisPool = null;
        // 定义redis实例
        Jedis jedis = null;
        try {
            // 获取redis连接池
            jedisPool = (JedisPool) applicationContext.getBean("jedisPool");
            // 获取redis实例
            jedis = jedisPool.getResource();
            if(jedis.exists(key.getBytes())) {
                return jedis.get(key.getBytes());
            }else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 释放资源
            free(jedis);
        }
        return null;
    }

    /**
     * 查看键是否存在
     * @param key 键
     * @return 存在状态
     */
    public boolean keyExists(String key) {
        // 定义redis连接池
        JedisPool jedisPool = null;
        // 定义redis实例
        Jedis jedis = null;
        try {
            // 获取redis连接池
            jedisPool = (JedisPool) applicationContext.getBean("jedisPool");
            // 获取redis实例
            jedis = jedisPool.getResource();
            return jedis.exists(key.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 释放资源
            free(jedis);
        }
        return false;
    }

    /**
     * 删除键值对
     * @param key
     */
    public void deleteKey(String key) {
        // 定义redis连接池
        JedisPool jedisPool = null;
        // 定义redis实例
        Jedis jedis = null;
        try {
            // 获取redis连接池
            jedisPool = (JedisPool) applicationContext.getBean("jedisPool");
            // 获取redis实例
            jedis = jedisPool.getResource();
            if (jedis.exists(key.getBytes())) {
                jedis.del(key.getBytes());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 释放资源
            free(jedis);
        }
    }

    /**
     * 入队列
     * @param dorm 寝室号-选择退出flag-学生学号
     */
    public void lpushValue(String dorm) {
        // 定义redis连接池
        JedisPool jedisPool = null;
        // 定义redis实例
        Jedis jedis = null;
        try {
            // 获取redis连接池
            jedisPool = (JedisPool) applicationContext.getBean("jedisPool");
            // 获取redis实例
            jedis = jedisPool.getResource();

            jedis.lpush("list",dorm);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 释放资源
            free(jedis);
        }
    }

    /**
     * 出队列
     * @return 寝室号-选择退出flag-学生学号
     */
    public Object rpopValue() {
        // 定义redis连接池
        JedisPool jedisPool = null;
        // 定义redis实例
        Jedis jedis = null;
        Object object=null;
        try {
            // 获取redis连接池
            jedisPool = (JedisPool) applicationContext.getBean("jedisPool");
            // 获取redis实例
            jedis = jedisPool.getResource();

            object=jedis.brpop(0,"list");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 释放资源
            free(jedis);
            return object;
        }
    }

    //释放资源
    private void free(Jedis jedis) {
        if (jedis != null) {
            jedis.close();
        }
    }
}
