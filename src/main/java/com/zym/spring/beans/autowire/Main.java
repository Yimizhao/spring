package com.zym.spring.beans.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext cx = new ClassPathXmlApplicationContext("Beans-autowire.xml");
		Person person = (Person) cx.getBean("person");
		System.out.println(person);
	}

}
