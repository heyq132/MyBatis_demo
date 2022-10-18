package com.heyq.mybatis.test;

import com.heyq.mybatis.mapper.DynamicSQLMapper;
import com.heyq.mybatis.pojo.Emp;
import com.heyq.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author heyq
 * @create 2022-10-15-11:44
 */
public class DynamicMapperTets {
    @Test
    public void TestGetEmpByCondition(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp=new Emp(null,"张三",null,"");
        List<Emp> list = mapper.getEmpByCondition(emp);
        list.forEach(System.out::println);
    }

    @Test
    public void TestGetEmpByChoose(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp=new Emp(null,"",20,"男");
        List<Emp> list = mapper.getEmpByChoose(emp);
        list.forEach(System.out::println);
    }

    @Test
    public void TestInsertMoreEmp(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp=new Emp(null,"小明1",20,"男");
        Emp emp2=new Emp(null,"小明2",20,"男");
        Emp emp3=new Emp(null,"小明3",20,"男");
        Emp emp4=new Emp(null,"小明4",20,"男");
        List<Emp> emps = Arrays.asList(emp, emp2, emp3, emp4);
        mapper.insertMoreEmp(emps);
    }

    @Test
    public void TestDeletetMoreEmp(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Integer[] empIds=new Integer[]{7,8,9};
        mapper.deleteMoreEmp(empIds);
    }
}
