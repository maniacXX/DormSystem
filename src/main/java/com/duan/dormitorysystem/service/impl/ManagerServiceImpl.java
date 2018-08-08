package com.duan.dormitorysystem.service.impl;

import com.duan.dormitorysystem.bean.Manager;
import com.duan.dormitorysystem.dao.ManagerMapper;
import com.duan.dormitorysystem.service.inter.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Duan
 * @date 2018/8/5 11:53
 */
@Service
public class ManagerServiceImpl implements ManagerService{

    @Autowired
    private ManagerMapper managerMapper;

    /**
     * 账号检查
     * @param manaId 管理员的账号
     * @return 管理员对象
     */
    public Manager adminCheck(String manaId) {
        Manager manager=managerMapper.selectByPrimaryKey(Long.parseLong(manaId));
        return manager;
    }
}
