package com.oneapm.dao;

import com.oneapm.model.User;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Lpp on 2016/4/5.
 */
public class UserDaoImplTest {

    private UserDao userDao ;
    @Before
    public void init(){
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
        String password = "amber" ;
        String email = "finley@163.com" ;
        User user = new User("finley",password,email) ;
        assertEquals(1,userDao.update(user)) ;
        User u = userDao.getUser("finley") ;
        assertNotNull(u);
        assertEquals(password,u.getUsername());
        assertEquals(email,u.getEmail());
    }

    @Test
    public void testGetUser() throws Exception {
        String username = "lpp" ;
        User user = userDao.getUser(username) ;
        assertNotNull(user);
        assertEquals(username,user.getUsername());
    }

    @Ignore
    @Test
    public void testGetAllUsers() throws Exception {

        List<User> users = userDao.getAllUsers() ;
        assertNotNull(users);
        assertTrue(users.size() >0);
    }
}