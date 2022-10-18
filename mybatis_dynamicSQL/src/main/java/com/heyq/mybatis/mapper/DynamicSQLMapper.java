package com.heyq.mybatis.mapper;

import com.heyq.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author heyq
 * @create 2022-10-15-11:32
 */
public interface DynamicSQLMapper {

    /**
     *根据条件查询员工信息
     * @param emp
     * @return
     */
    List<Emp> getEmpByCondition(Emp emp);

    /**
     * 根据choose查询员工信息
     * @param emp
     * @return
     */
    List<Emp> getEmpByChoose(Emp emp);

    /**
     * 批量添加员工信息
     * @param emps
     */
    void insertMoreEmp(@Param("emps") List<Emp> emps);


    /**
     * 批量删除员工信息
     * @param empIds
     */
    void deleteMoreEmp(@Param("empIds") Integer[] empIds);


}
