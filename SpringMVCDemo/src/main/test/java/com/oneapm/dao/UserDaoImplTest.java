package com.oneapm.dao;

import com.oneapm.model.User;
import com.oneapm.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Lpp on 2016/4/5.
 */
public class UserDaoImplTest {

    private UserDao userDao;
    private SqlSession sqlSession  ;
    @Before
    public void init() {
        sqlSession = MyBatisUtil.getSqlSession();
        userDao = sqlSession.getMapper(UserDao.class);
    }

    @Test
    public void testAdd() throws Exception {
        int count1 = userDao.getAllUsers().size() ;
        User user = new User("finley", "finley", "finley@163.com");
        userDao.addUser(user);
        sqlSession.commit();
        int count2 = userDao.getAllUsers().size() ;
        sqlSession.close();
        assertEquals(count1+1,count2);
    }

    @Test
    public void testDelete() throws Exception {
        int count1 = userDao.getAllUsers().size() ;
        userDao.deleteUser("finley") ;
        sqlSession.commit();
        int count2 = userDao.getAllUsers().size() ;
        assertEquals(count1-1,count2);
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

        userDao.updateUser(u2);
        sqlSession.commit();
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

    @After
    public void close(){
      //  sqlSession.close();
    }
}