package com.zym.spring.beans.spel;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-spel.xml");
		Person dataSource = (Person) context.getBean("person");
		System.out.println(dataSource);

	}

}
