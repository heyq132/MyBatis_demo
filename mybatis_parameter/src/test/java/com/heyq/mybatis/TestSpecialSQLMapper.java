package com.heyq.mybatis;

import com.heyq.mybatis.mapper.SpecialSQLMapper;
import com.heyq.mybatis.pojo.User;
import com.heyq.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author heyq
 * @create 2022-10-14-11:16
 */
public class TestSpecialSQLMapper {

    @Test
    public void TestGetUserByLike(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> list = mapper.getUserByLike("e");
        list.forEach(System.out::println);
    }

    @Test
    public void TestDeleteMoreUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        mapper.deleteMoreUser("5,6");
    }

    @Test
    public void TestDeleteMoreUsername(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        mapper.deleteMoreUsername("a");
    }


    @Test
    public void TestGetUserList(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> list = mapper.getUserList("t_user");
        list.forEach(System.out::println);
    }


    @Test
    public void TestInsetUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        User user=new User(null,"zhangsan","safhf",30,"女","48964@qq.com");
        mapper.insertUser(user);
        System.out.println(user);
    }

}
