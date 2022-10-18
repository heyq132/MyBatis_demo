package com.heyq.mybatis.mapper;

import com.heyq.mybatis.pojo.User;

import java.util.List;

/**
 * @author heyq
 * @create 2022-10-12-19:38
 */
public interface UserMapper {

    /**
     * 添加用户信息
     */
    int insertUser();

    /**
     * 修改用户信息
     * @return
     */
    void updateUser();

    /**
     * 删除用户信息
     */
    void DeleteUser();

    /**
     * 根据id查询用户信息
     */
    User getUserById();

    /**
     * 查询所有用户信息
     */
    List<User> getAllUser();

}

