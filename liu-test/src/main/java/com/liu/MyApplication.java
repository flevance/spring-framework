package com.liu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ljt
 * @Description
 * @date 2021/05/07 上午11:50
 * @Version 1.0.0
 */
public class MyApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:application.xml");
		Person person = applicationContext.getBean("person", Person.class);
		System.out.println(person.getAge() + person.getName());
	}
}
