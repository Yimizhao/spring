package com.zym.spring.beans.spel;

public class Car {
	private String brand;
	private float price;

	private float perimeter;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Car() {
		System.out.println("Car's 构造器");
	}

	public float getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(float perimeter) {
		this.perimeter = perimeter;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", perimeter=" + perimeter + "]";
	}

}
