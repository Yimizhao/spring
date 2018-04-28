package com.zym.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;
/**
 * 静态工厂方法
 * @author zhaoyingming
 *
 */
public class StaticCarFactory {

	private static Map<String, Car> carMap = new HashMap<String, Car>();

	static {
		carMap.put("audi", new Car("audi", 300000));
		carMap.put("dazhong", new Car("dazhong", 400000));

	}

	public static Car getCar(String name) {
		return carMap.get(name);
	}
}
