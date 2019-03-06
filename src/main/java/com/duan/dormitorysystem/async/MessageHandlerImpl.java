package com.duan.dormitorysystem.async;

import com.duan.dormitorysystem.bean.*;
import com.duan.dormitorysystem.dao.MessageMapper;
import com.duan.dormitorysystem.dao.StuRelationBulMapper;
import com.duan.dormitorysystem.dao.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

/**
 * @author Duan
 * @date 2019/3/6 10:08
 */

@Service
public class MessageHandlerImpl implements MessageHandler{


    @Autowired
    MessageMapper messageMapper;

    @Autowired
    StuRelationBulMapper stuRelationBulMapper;

    @Autowired
    StudentMapper studentMapper;

    /**
     * 对从消息队列中获取到的寝室变动消息进行获取，并分发给其室友
     * @param statu 寝室号-选择退出标准-学生学号
     */
    public void createMessage(String statu) {
        String[] infos= statu.split("-");

        //获得改选人的信息
        Student student=studentMapper.selectByPrimaryKey(Long.valueOf(infos[2]));

        //获得这个寝室的所有学生
        StuRelationBulExample stuRelationBulExample=new StuRelationBulExample();
        StuRelationBulExample.Criteria criteria=stuRelationBulExample.createCriteria();
        criteria.andDormIdEqualTo(Long.valueOf(infos[0]));
        List<StuRelationBul> list=stuRelationBulMapper.selectByExample(stuRelationBulExample);

        Iterator iterator=list.iterator();

        //除了本人都发送
        while(iterator.hasNext()){
            StuRelationBul stu= (StuRelationBul) iterator.next();

            if(!stu.getStuId().equals(student.getStuId())){
                Message message=new Message();
                message.setStuId(stu.getStuId());
                if("0".equals(infos[1])){
                    message.setText(student.getStuName()+"退出了本寝室");
                }else {
                    message.setText(student.getStuName()+"选择了本寝室");
                }
                messageMapper.insert(message);
            }
        }
    }

    /**
     * 从message中根据其学号获得对应信息
     * @param stuId 学生学号
     */
    public String getMessages(String stuId) {
        MessageExample messageExample=new MessageExample();
        MessageExample.Criteria criteria=messageExample.createCriteria();
        criteria.andStuIdEqualTo(Long.valueOf(stuId));
        criteria.andReadFlagEqualTo((byte)1);
        List<Message> messages=messageMapper.selectByExample(messageExample);

        //无新消息直接返回
        if (messages.isEmpty()){
            return  null;
        }

        //拼装信息
        String info="";
        Iterator iterator=messages.iterator();
        while(iterator.hasNext()){
            info+=iterator.next()+";\n";
        }

        return info;
    }

    /**
     * 从message中根据其学号删除对应信息
     * @param stuId 学生学号
     */
    public void delMessage(String stuId) {
        MessageExample messageExample=new MessageExample();
        MessageExample.Criteria criteria=messageExample.createCriteria();
        criteria.andStuIdEqualTo(Long.valueOf(stuId));

        messageMapper.deleteByExample(messageExample);
    }
}
