package com.learn.core.SpringCoreDemo.ReferenceInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTest {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/learn/core/SpringCoreDemo/ReferenceInjection/RefConfig.xml");
		Object1 obj1 =(Object1) context.getBean("object1");
		System.out.println(obj1);
	}

}
