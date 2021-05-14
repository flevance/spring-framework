package com.liu.beanPostProcessor;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author ljt
 * @Description
 * @date 2021/05/12 上午11:48
 * @Version 1.0.0
 */
public class MyBeanPostProcessor implements BeanPostProcessor {


	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Before加载:" + beanName + ",内容为:" +  bean.toString());
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("After加载:" + beanName + ",内容为:" +  bean.toString());
		return bean;
	}
}
