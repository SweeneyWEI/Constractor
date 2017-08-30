package com.yjg;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

/**
 * Created by weixin on 17-8-28.
 */
public class Mybatis {
    public static void main(String[] args) throws IOException {
        InputStream stream= Resources.getResourceAsStream("mabatis-config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(stream);

        SqlSession session=sqlSessionFactory.openSession();
        UserDao userDao=session.getMapper(UserDao.class);
        System.out.println(userDao.userInfo("1").toString());
        System.out.println(userDao.userlist("2","wx").toString());
    }
}
