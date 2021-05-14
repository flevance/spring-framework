package com.liu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ljt
 * @Description
 * @date 2021/05/07 下午1:55
 * @Version 1.0.0
 */
public class MyApplicationTest {

	public static void main(String[] args) {

		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:application.xml");
		Person person = applicationContext.getBean("person", Person.class);
		System.out.println(person.getName());

	}
}
