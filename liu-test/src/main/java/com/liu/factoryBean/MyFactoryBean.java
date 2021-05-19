package com.liu.factoryBean;

import com.liu.Person;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author ljt
 * @Description
 * @date 2021/05/19 下午5:38
 * @Version 1.0.0
 */
public class MyFactoryBean implements FactoryBean<Person> {

	@Override
	public Person getObject() throws Exception {
		Person person = new Person();
		person.setName("Python");
		person.setAge(21);
		return person;
	}

	@Override
	public Class<Person> getObjectType() {
		return Person.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
