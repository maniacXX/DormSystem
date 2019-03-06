package com.duan.dormitorysystem.async;

public interface MessageHandler {

    /**
     * 对从消息队列中获取到的寝室变动消息进行获取，并分发给其室友
     * @param statu 寝室号-选择退出标准-学生学号
     */
    void createMessage(String statu);

    /**
     * 从message中根据其学号获得对应信息
     * @param stuId 学生学号
     */
    String getMessages(String stuId);

    /**
     * 从message中根据其学号删除对应信息
     * @param stuId 学生学号
     */
    void delMessage(String stuId);
}
