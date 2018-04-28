package com.zym.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

public class InstanceFactory {
	private Map<String, Car> cars;

	public InstanceFactory() {
		cars = new HashMap<String, Car>();
		cars.put("audi", new Car("audi", 300000));
		cars.put("dazhong", new Car("dazhong", 400000));
	}

	public Car getCar(String name) {
		return cars.get(name);
	}
}
