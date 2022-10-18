package com.heyq.mybatis.mapper;

import com.heyq.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author heyq
 * @create 2022-10-14-11:05
 */
public interface SpecialSQLMapper {

    /**
     * 通过用户名模糊查询用户信息
     * @param mohu
     * @return
     */
    List<User> getUserByLike(@Param("mohu") String mohu);

    /**
     * 批量删除
     * @param ids
     */
    void deleteMoreUser(@Param("ids") String ids);

    /**
     * 删除
     * @param username
     */
    void deleteMoreUsername(@Param("username") String username);

    /**
     * 动态设置表名，查询用户信息
     * @param tableName
     * @return
     */
    List<User> getUserList(@Param("tableName") String tableName);


    /**
     * 添加用户信息并获取自增的主键
     * @param user
     */
    void insertUser(User user);
}
