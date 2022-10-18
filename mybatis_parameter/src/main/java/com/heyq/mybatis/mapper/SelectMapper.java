package com.heyq.mybatis.mapper;

import com.heyq.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author heyq
 * @create 2022-10-13-19:25
 */
public interface SelectMapper {

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    User getUserById(@Param("id") Integer id);


    /**
     * 查询所有用户的信息
     * @return
     */
    List<User> getAllUser();

    /**
     * 查询用户的总数量
     * @return
     */
    Integer getCount();


    /**
     *根据id查询用户信息为map集合
     * @param id
     * @return
     */
    Map<String ,Object> getUserByIdToMap(@Param("id") Integer id);

    /**
     * 查询所有的用户信息为map集合
     * @return
     * 将表中的数据以map集合的方式查询，一条数据对应一个map；若有多条数据，就会产生多个map集合，并
     * 且最终要以一个map的方式返回数据，此时需要通过@MapKey注解设置map集合的键，值是每条数据所对应的map集合
     */
    @MapKey("id")
    Map<String ,Object> getAllUserToMpp();



}
