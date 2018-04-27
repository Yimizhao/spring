package com.zym.spring.beans.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans-lifecycle.xml");
		Car car = (Car) context.getBean("car");
		System.out.println(car);
		context.close();
	}
}
