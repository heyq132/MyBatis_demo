package com.heyq.mybatis.test;

import com.heyq.mybatis.mapper.EmpMapper;
import com.heyq.mybatis.pojo.Emp;
import com.heyq.mybatis.pojo.EmpExample;
import com.heyq.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author heyq
 * @create 2022-10-15-17:13
 */
public class MBGTest {

    @Test
    public void TestMBG(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        //根据id查询数据
//        Emp emp = mapper.selectByPrimaryKey(1);
//        System.out.println(emp);
        //根据条件查询数据
        /*List<Emp> lists = mapper.selectByExample(null);
        EmpExample example=new EmpExample();
        example.createCriteria().andEmpNameEqualTo("张三").andAgeGreaterThanOrEqualTo(20);
        example.or().andGenderEqualTo("男");
        List<Emp> lists = mapper.selectByExample(example);
        lists.forEach(System.out::println);*/


        Emp emp=new Emp(1,"大美",20,"女");
        //测试普通修改
        //mapper.updateByPrimaryKey(emp);
        //测试选择性修改
        mapper.updateByPrimaryKeySelective(emp);

    }

}
