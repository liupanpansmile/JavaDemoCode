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

    private UserDao userDao ;
    @Before
    public void init() {
        userDao = new UserDaoImpl() ;
    }

    @Test
    public void testAdd() throws Exception {
        User user = new User("finley","finley","finley@163.com") ;
        assertEquals(1,userDao.add(user)) ;
    }

    @Test
    public void testDelete() throws Exception {
        assertEquals(1,userDao.delete("finley")) ;
    }

    @Test
    public void testUpdate() throws Exception {
        String username = "finleyxx" ;
        String password = "amber" ;
        String email = "finley@163.com" ;

        User user = new User(username,"finley",email) ;
        userDao.add(user) ;

        User u2 =userDao.getUser(username) ;
        u2.setPassword(password) ;

        assertEquals(1,userDao.update(u2)) ;
        User u = userDao.getUser(username) ;
        assertNotNull(u);
        assertEquals(password,u.getPassword());
        assertEquals(email,u.getEmail());

        userDao.delete(username) ;
    }

    @Test
    public void testGetUser() throws Exception {
        String username = "lpp" ;
        User user = userDao.getUser(username) ;
        assertNotNull(user);
        assertEquals(username,user.getUsername());
    }

    @Test
    public void testGetAllUsers() throws Exception {
        List<User> users = userDao.getAllUsers() ;
        assertNotNull(users);
        assertTrue(users.size() >0);
    }
}