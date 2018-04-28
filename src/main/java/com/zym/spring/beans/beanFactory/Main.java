package com.zym.spring.beans.beanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-beanFactory.xml");
		Car car = (Car) context.getBean("car");
		System.out.println(car);
	}
}
