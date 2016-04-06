package com.oneapm.dao;

import com.oneapm.model.User;

import java.util.List;

/**
 * Created by Lpp on 2016/4/5.
 */
public interface UserDao {
    int addUser(User user);

    int deleteUser(String username);

    int updateUser(User user);

    User getUser(String username);

    List<User> getAllUsers();
}
