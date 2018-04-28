package com.zym.spring.beans.factory;

public class Car {
	private String brand;

	private float price;

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

	public Car(String brand, float price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	public Car() {
		super();
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + "]";
	}

}
