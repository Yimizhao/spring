package com.zym.spring.beans.beanFactory;

import org.springframework.beans.factory.FactoryBean;

public class CarBeanFactory implements FactoryBean<Car> {

	private String brand;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public Car getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Car(brand, 500000);
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return CarBeanFactory.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}

}
