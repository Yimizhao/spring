package com.zym.spring.beans.lifecycle;

public class Car {
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		System.out.println("setBrand...");
		this.brand = brand;
	}
	
	public Car() {
		System.out.println("Car's 构造器");
		// TODO Auto-generated constructor stub
	}
	
	public void start() {
		System.out.println("start....");
	}
	
	public void last() {
		System.out.println("last....");
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + "]";
	}

}
