package com.oneapm.dao;

import com.oneapm.model.User;

import java.util.List;

/**
 * Created by Lpp on 2016/4/5.
 */
public interface UserDao {
    void addUser(User user);

    void deleteUser(String username);

    void updateUser(User user);

    User getUser(String username);

    List<User> getAllUsers();
}
