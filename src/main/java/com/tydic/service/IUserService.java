package com.tydic.service;

import com.tydic.bean.UserBean;

public interface IUserService {
    UserBean findUserByUserName(String name);
    UserBean findById(Integer id);
}
