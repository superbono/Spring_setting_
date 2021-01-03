package com.project.myapp;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

/*
@RunWith(SpringJUnit4ClassRunner.class)
*/
//@ContextConfiguration(
//		locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MyBatisTest {
	
	@Inject
	SqlSessionFactory sf;
	
	@Test
	public void testFactory() {
		System.out.println(sf);
	}
	
	@Test
	public void testSession() throws Exception {
		try {
			SqlSession sqlSession = sf.openSession();
			System.out.println(sqlSession);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
