package com.zym.spring.beans.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-scope.xml");
		Car car1 = (Car) context.getBean("car");
		Car car2 = (Car) context.getBean("car");
		System.out.println(car1 == car2);
	}

}
