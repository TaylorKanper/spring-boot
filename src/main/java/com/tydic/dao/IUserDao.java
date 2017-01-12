package com.tydic.dao;

import com.tydic.bean.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao extends JpaRepository<UserBean, Integer> {
    UserBean findByUserName(String userName);
    UserBean findById(Integer id);
}
