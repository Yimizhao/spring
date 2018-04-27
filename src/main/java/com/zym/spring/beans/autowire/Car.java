package com.zym.spring.beans.autowire;

public class Car {
	private String bread;
	private String price;

	public String getBread() {
		return bread;
	}

	public void setBread(String bread) {
		this.bread = bread;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [bread=" + bread + ", price=" + price + "]";
	}

}
