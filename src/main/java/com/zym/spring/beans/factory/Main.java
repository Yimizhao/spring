package com.zym.spring.beans.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-factory.xml");
		Car car = (Car) context.getBean("car");
		Car car1 = (Car) context.getBean("car1");
		System.out.println(car);
		System.out.println(car1);
	}
}
