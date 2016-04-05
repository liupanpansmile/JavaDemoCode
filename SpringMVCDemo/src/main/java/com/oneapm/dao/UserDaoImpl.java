package com.oneapm.dao;

import com.oneapm.model.User;
import com.oneapm.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Lpp on 2016/4/5.
 */
public class UserDaoImpl implements UserDao{
    private SqlSession sqlSession ;

    public UserDaoImpl(){
        sqlSession = MyBatisUtil.getSqlSession() ;
    }
    public int add(User user) {
        String statement = "addUser" ;
        return sqlSession.insert(statement,user) ;
    }

    public int delete(String username) {
        String statement = "deleteUser" ;
        return sqlSession.delete(statement,username) ;
    }

    public int update(User user) {
        String statement = "updateUser" ;
        return sqlSession.update(statement,user) ;
    }

    public User getUser(String username) {
        String statement = "getUser" ;
        return sqlSession.selectOne(statement,username);
    }

    public List<User> getAllUsers() {
        String statement = "getAllUsers" ;
        //return sqlSession.selectList(statement);
        return null ;
    }
}
