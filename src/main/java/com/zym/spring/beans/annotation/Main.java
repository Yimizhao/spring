package com.zym.spring.beans.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zym.spring.beans.annotation.component.TestObject;
import com.zym.spring.beans.annotation.controller.UserController;
import com.zym.spring.beans.annotation.repository.UserRepository;
import com.zym.spring.beans.annotation.service.UserService;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-annotation.xml");
//		TestObject testObject = (TestObject) context.getBean("testObject");
//		System.out.println(testObject);
//		UserRepository userRepository = (UserRepository) context.getBean("userRepository");
//		System.out.println(userRepository);
//		UserService userService = (UserService) context.getBean("userService");
//		System.out.println(userService);
		UserController userController = (UserController) context.getBean("userController");
		userController.add();
//		System.out.println(userController);
	}
}
