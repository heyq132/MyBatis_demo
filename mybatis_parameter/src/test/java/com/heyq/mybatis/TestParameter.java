package com.heyq.mybatis;

import com.heyq.mybatis.mapper.UserMapper;
import com.heyq.mybatis.pojo.User;
import com.heyq.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author heyq
 * @create 2022-10-13-10:56
 */
public class TestParameter {

    @Test
    public void getUserByUsername(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserByUsername("root");
        System.out.println(user);
    }


    @Test
    public void testcheckLogin(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLogin("root","132");
        System.out.println(user);
    }


    @Test
    public void testcheckLoginByMap(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String ,Object> map=new HashMap<>();
        map.put("username","root");
        map.put("password","132");
        User user = mapper.checkLoginByMap(map);
        System.out.println(user);
    }


    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user=new User(null,"heyq","123456",22,"男","132544@qq.com");
        mapper.insertUser(user);
    }


    @Test
    public void testCheckLoginByParam(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLogin("root","132");
        System.out.println(user);
    }
}
