package com.zym.spring.beans.annotation.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

	public void insert() {
		System.out.println("UserRepository insert...");
	}
}
