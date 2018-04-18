package com.zym.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springFirst.xml");
//		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
//		helloWorld.hello();
		Car car1 = (Car) context.getBean("car1");
		System.out.println(car1);
		Car car2 = (Car) context.getBean("car2");
		System.out.println(car2);
		Car car3 = (Car) context.getBean("car3");
		System.out.println(car3);
	}
}
