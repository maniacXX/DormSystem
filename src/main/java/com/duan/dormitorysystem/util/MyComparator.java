package com.duan.dormitorysystem.util;

import com.duan.dormitorysystem.bean.StuRelationBul;
import com.duan.dormitorysystem.bean.Student;

import java.util.Comparator;

/**
 * @author Administrator
 * @date 2018/7/7 20:53
 */

public class MyComparator implements Comparator<StuRelationBul>{
    public int compare(StuRelationBul o1, StuRelationBul o2) {
        return o1.getBedNum()-o2.getBedNum();
    }
}
