package com.heyq.mybatis.mapper;

import com.heyq.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * @author heyq
 * @create 2022-10-14-16:58
 */
public interface DeptMapper {


    /**
     * 通过分布查询查询员工以及所对应的部门信息第二步
     * @return
     */
    Dept getEmpAndDeptByStepTwo(@Param("deptId") Integer deptId);


    /**
     * 通过部门id查询部门信息及所有的员工信息
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpByDeptId(@Param("deptId") Integer deptId);

    /**
     * 通过分布查询查询部门以及部门的所有员工信息第一步
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpByStepOne(@Param("deptId") Integer deptId);
}
