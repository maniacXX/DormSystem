package com.duan.dormitorysystem.service.inter;

import com.duan.dormitorysystem.bean.StuRelationInter;
import org.springframework.stereotype.Service;

/**

 * @author Duan
 * @date 2018/8/8 16:06
 */

public interface StuRelationInterService {

    /**
     * 添加一组新的学生与兴趣的关联
     * @param stuRelationInter 对象
     */
    void add(StuRelationInter stuRelationInter);

    /**
     * 检查对应学生id是否有对应的兴趣存入
     * @param stuId 学生id
     * @return 存在布尔值
     */
    boolean check(long stuId);
}
