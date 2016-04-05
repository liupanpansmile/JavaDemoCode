package com.oneapm.dao;

import com.oneapm.model.User;

import java.util.List;

/**
 * Created by Lpp on 2016/4/5.
 */
public interface UserDao {
    int add(User user) ;
    int delete(String username) ;
    int update(User user) ;
    User getUser(String username) ;
    List<User> getAllUsers() ;
}
