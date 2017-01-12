package com.tydic.service.impl;

import com.tydic.bean.UserBean;
import com.tydic.dao.IUserDao;
import com.tydic.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    public UserBean findUserByUserName(String name) {
        try {
            UserBean user = userDao.findByUserName(name);
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
        }
        return null;
    }

    @Override
    public UserBean findById(Integer id) {
        try {
            return userDao.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
        }
        return null;
    }
}
