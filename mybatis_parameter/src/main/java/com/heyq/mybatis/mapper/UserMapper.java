package com.heyq.mybatis.mapper;

import com.heyq.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @author heyq
 * @create 2022-10-13-10:35
 */
public interface UserMapper {
    /**
     * 根据用户名查询用户信息
     */
    User getUserByUsername(String username);


    /**
     * 验证登录
     * @param username
     * @param password
     * @return
     */
    User checkLogin(String username,String password);


    /**
     * 验证登录（以map集合作为参数
     * @param map
     * @return
     */
    User checkLoginByMap(Map<String ,Object> map);

    /**
     * 添加用户信息
     * @param user
     */
    void insertUser(User user);

    /**
     * 验证登录（使用@param注解）
     * @param username
     * @param password
     * @return
     */
    User checkLoginByParam(@Param("username")String username,@Param("password")String password);
}
