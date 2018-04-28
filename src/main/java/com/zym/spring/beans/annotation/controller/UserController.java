package com.zym.spring.beans.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.zym.spring.beans.annotation.service.UserService;

@Controller("userController")
public class UserController {

	@Autowired
	UserService userService;
	
	public void add() {
		userService.save();
		System.out.println("UserController add...");
	}
}
