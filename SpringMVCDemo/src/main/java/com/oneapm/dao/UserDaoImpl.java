package com.oneapm.dao;

import com.oneapm.model.User;
import com.oneapm.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Lpp on 2016/4/5.
 */
public class UserDaoImpl implements UserDao {
    private SqlSession sqlSession;

    public UserDaoImpl() {
        sqlSession = MyBatisUtil.getSqlSession();
    }

    public int addUser(User user) {
        String statement = "com.oneapm.mapping.userMapper.addUser";
        int result = sqlSession.insert(statement, user);
        sqlSession.commit(); //must commit !!!!
        return result;
    }

    public int deleteUser(String username) {
        String statement = "com.oneapm.mapping.userMapper.deleteUser";
        int result = sqlSession.delete(statement, username);
        sqlSession.commit(); //must commit !!!!
        return result;
    }

    public int updateUser(User user) {
        String statement = "com.oneapm.mapping.userMapper.updateUser";
        int result = sqlSession.update(statement, user);
        sqlSession.commit();
        return result;
    }

    public User getUser(String username) {
        String statement = "com.oneapm.mapping.userMapper.getUser";
        User user = sqlSession.selectOne(statement, username);
        sqlSession.commit();
        return user;
    }

    public List<User> getAllUsers() {
        String statement = "com.oneapm.mapping.userMapper.getAllUsers";
        List<User> users = sqlSession.selectList(statement);
        return users;
    }

//    public static void main(String[] args) {
//        UserDao userDao = new UserDaoImpl() ;
//        User u = new User("aa","aa","aa") ;
//        userDao.add(u) ;
//        List<User> list = userDao.getAllUsers() ;
//        for (User user:list){
//            System.out.println(user);
//        }
//
//    }
}
