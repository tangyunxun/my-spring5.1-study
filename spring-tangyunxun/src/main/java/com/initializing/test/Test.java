package com.initializing.test;

import com.initializing.app.AppConfig;
import com.initializing.service.IndexService;
import com.initializing.service.UserService;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author Axun
 * @Create 2020/3/18 16:46
 */
public class Test {
	public static void main(String[] args){

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		/*ac.register(AppConfig.class);

		AbstractAutowireCapableBeanFactory beanFactory = (AbstractAutowireCapableBeanFactory) ac.getBeanFactory();

		beanFactory.setAllowCircularReferences(false);

		ac.refresh();*/

		/*System.out.println(ac.getBean(UserService.class));

		System.out.println(ac.getBean(IndexService.class));*/




	}
}
