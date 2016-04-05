package com.oneapm.utils;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Created by Lpp on 2016/4/5.
 */
public class MyBatisUtil {
    private static SqlSession sqlSession ;
    private static InputStream inputStream ;
    public static SqlSession getSqlSession(){
        if(sqlSession == null){
            String resource = "conf.xml" ;
            createSqlSession(resource);
        }
        return sqlSession ;
    }

    protected static void createSqlSession(String resource){
        inputStream = MyBatisUtil.class.getClassLoader().getResourceAsStream(resource) ;
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream) ;
        sqlSession = sessionFactory.openSession();
    }

    @Override
    protected void finalize() throws Throwable {
        if(inputStream != null){
            inputStream.close();
        }
    }
}
