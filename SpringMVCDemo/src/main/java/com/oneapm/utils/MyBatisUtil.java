package com.oneapm.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by Lpp on 2016/4/5.
 */
public class MyBatisUtil {
    private static SqlSession sqlSession;
    private static Reader reader;

    public static synchronized SqlSession getSqlSession() {
        if (sqlSession == null) {
            String resource = "conf.xml";
            createSqlSession(resource);
        }
        return sqlSession;
    }

    protected static void createSqlSession(String resource) {
        try {
            reader = Resources.getResourceAsReader(resource) ;
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
            sqlSession = sessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void finalize() throws Throwable {
        if (reader != null) {
            reader.close();
        }
    }
}
