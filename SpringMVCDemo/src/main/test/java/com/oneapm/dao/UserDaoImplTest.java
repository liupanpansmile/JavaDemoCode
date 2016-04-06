package com.oneapm.dao;

import com.oneapm.model.User;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Lpp on 2016/4/5.
 */
public class UserDaoImplTest {

    private UserDao userDao;

    @Before
    public void init() {
        userDao = new UserDaoImpl();
    }

    @Test
    public void testAdd() throws Exception {
        User user = new User("finley", "finley", "finley@163.com");
        assertEquals(1, userDao.addUser(user));
    }

    @Test
    public void testDelete() throws Exception {
        assertEquals(1, userDao.deleteUser("finley"));
    }

    @Test
    public void testUpdate() throws Exception {
        String username = "finleyxx";
        String password = "amber";
        String email = "finley@163.com";

        User user = new User(username, "finley", email);
        userDao.addUser(user);

        User u2 = userDao.getUser(username);
        u2.setPassword(password);

        assertEquals(1, userDao.updateUser(u2));
        User u = userDao.getUser(username);
        assertNotNull(u);
        assertEquals(password, u.getPassword());
        assertEquals(email, u.getEmail());

        userDao.deleteUser(username);
    }

    @Test
    public void testGetUser() throws Exception {
        String username = "lpp";
        User user = userDao.getUser(username);
        assertNotNull(user);
        assertEquals(username, user.getUsername());
    }

    @Test
    public void testGetAllUsers() throws Exception {
        List<User> users = userDao.getAllUsers();
        assertNotNull(users);
        assertTrue(users.size() > 0);
    }
}