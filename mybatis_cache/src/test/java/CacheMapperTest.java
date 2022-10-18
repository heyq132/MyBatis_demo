import com.heyq.mybatis.mapper.CacheMapper;
import com.heyq.mybatis.pojo.Emp;
import com.heyq.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author heyq
 * @create 2022-10-15-15:35
 */
public class CacheMapperTest {

    @Test
    public void TestCache() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatisconfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession1 = sqlSessionFactory.openSession(true);
        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
        Emp emp1 = mapper1.getEmpById(1);
        System.out.println(emp1);
        sqlSession1.close();
        SqlSession sqlSession2 = sqlSessionFactory.openSession(true);
        CacheMapper mapper2 = sqlSession2 .getMapper(CacheMapper.class);
        Emp emp2 = mapper2.getEmpById(1);
        System.out.println(emp2);
        sqlSession2.close();
    }

    @Test
    public void TestGetEmpById(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
        Emp emp = mapper.getEmpById(1);
        System.out.println(emp);
        mapper.insertEmp(new Emp(null,"ashfdj",30,"女"));
        Emp emp1 = mapper.getEmpById(1);
        System.out.println(emp1);


    }
}
