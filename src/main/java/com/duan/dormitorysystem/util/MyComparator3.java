package com.duan.dormitorysystem.util;

import com.duan.dormitorysystem.bean.Building;

import java.util.Comparator;

/**
 * @author Administrator
 * @date 2018/8/8 15:10
 */

public class MyComparator3 implements Comparator<Building>{

    public int compare(Building o1, Building o2) {
        return Integer.parseInt(o1.getBuildingNumber()+o1.getDormNumber())-
                Integer.parseInt(o2.getBuildingNumber()+o2.getDormNumber());
    }
}
