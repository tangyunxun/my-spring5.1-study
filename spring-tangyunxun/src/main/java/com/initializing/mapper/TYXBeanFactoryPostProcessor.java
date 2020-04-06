package com.initializing.mapper;

import com.initializing.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @Author Axun
 * @Create 2020/3/18 23:06
 */

public class TYXBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

		GenericBeanDefinition index = (GenericBeanDefinition)beanFactory.getBeanDefinition("indexService");

		index.setBeanClass(UserService.class);
	}
}
