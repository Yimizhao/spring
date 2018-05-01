package com.zym.spring.jdbc;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJdbcTemplate {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-jdbc.xml");
	
	@Autowired
	static JdbcTemplate jdbcTemplate;
//	{
//		jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
//	}
	
	@Test
	public void updata() {
		
//		String sql = "INSERT INTO student (name,location,gender,grade) VALUES (?,?,?,?)";
//		int rel = jdbcTemplate.update(sql, "zhao","shanghai","nan","90");
		System.out.println(jdbcTemplate);
	}
	
}
