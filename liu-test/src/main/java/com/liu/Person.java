package com.liu;

import org.springframework.beans.factory.SmartInitializingSingleton;

/**
 * @author ljt
 * @Description
 * @date 2021/05/07 上午11:50
 * @Version 1.0.0
 */
public class Person implements SmartInitializingSingleton {

	private int age;

	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void afterSingletonsInstantiated() {
		System.out.println("afterSingletonsInstantiated: Person初始化的结果是:" + this.toString());
	}

	@Override
	public String toString() {
		return "Person{" +
				"age=" + age +
				", name='" + name + '\'' +
				'}';
	}
}
