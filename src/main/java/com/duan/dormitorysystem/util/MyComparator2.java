package com.duan.dormitorysystem.util;

import com.duan.dormitorysystem.bean.StuRelationBul;

import java.util.Comparator;

/**
 * @author Duan
 * @date 2018/8/8 15:07
 */

public class MyComparator2 implements Comparator<StuRelationBul> {
    public int compare(StuRelationBul o1, StuRelationBul o2) {
        return (int) (o2.getDormId()-o1.getDormId());
    }
}
