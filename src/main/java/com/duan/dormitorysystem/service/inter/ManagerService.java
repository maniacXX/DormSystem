package com.duan.dormitorysystem.service.inter;

import com.duan.dormitorysystem.bean.Manager;

public interface ManagerService {

    /**
     * 登录检查
     * @param manaId 管理员的账号
     * @return 管理员对象
     */
    Manager adminCheck(String manaId);
}
