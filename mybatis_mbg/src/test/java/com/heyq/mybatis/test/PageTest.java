package com.heyq.mybatis.test;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.heyq.mybatis.mapper.EmpMapper;
import com.heyq.mybatis.pojo.Emp;
import com.heyq.mybatis.pojo.EmpExample;
import com.heyq.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author heyq
 * @create 2022-10-16-9:31
 */
public class PageTest {

    @Test
    public void testPage(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        //开启查询之前开启分页功能
        Page<Object> page = PageHelper.startPage(1, 4);
        List<Emp> list = mapper.selectByExample(null);
        //查询功能之后可以获取分页相关得所有数据
        PageInfo<Emp> pageInfo = new PageInfo<>(list, 5);
        list.forEach(System.out::println);
        System.out.println(pageInfo);
        System.out.println(page);
    }

}
