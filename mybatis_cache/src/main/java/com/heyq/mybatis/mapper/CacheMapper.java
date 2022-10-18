package com.heyq.mybatis.mapper;

import com.heyq.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @author heyq
 * @create 2022-10-15-15:31
 */
public interface CacheMapper {

    /**
     * 根据员工id查询员工信息
     * @param empId
     * @return
     */
    Emp getEmpById(@Param("empId") Integer empId);

    /**
     * 添加员工信息
     * @param emp
     */
    void insertEmp(Emp emp);
}
