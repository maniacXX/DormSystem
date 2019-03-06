package com.duan.dormitorysystem.service.inter;


public interface JedisService {

    /**
     * 保存键值对到redis（值为字符串）
     * @param key 键
     * @param value 值
     */
    void setString(String key,String value);

    /**
     * 保存键值对到redis（值为对象）
     * @param key 键
     * @param value 值
     */
    void setObject(String key,Object value);

    /**
     * 获得redis中的值,值为字符串
     * @param key 键
     * @return 值
     */
    String getString(String key);

    /**
     * 获得redis中的值,值为对象
     * @param key 键
     * @return 值
     */
    Object getObject(String key);

    /**
     * 查看键是否存在
     * @param key 键
     * @return 存在状态
     */
    boolean keyExists(String key);

    /**
     * 删除键值对
     * @param key
     */
    void deleteKey(String key);


    /**
     * 入队列
     * @param dorm 寝室号-选择退出flag-学生学号
     */
    void lpushValue(String dorm);

    /**
     * 出队列
     * @return 寝室号-选择退出flag-学生学号
     */
    Object rpopValue();
}
