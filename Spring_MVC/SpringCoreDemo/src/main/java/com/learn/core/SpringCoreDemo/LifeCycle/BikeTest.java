package com.learn.core.SpringCoreDemo.LifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BikeTest {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/learn/core/SpringCoreDemo/LifeCycle/config.xml");
		MotorBike bike1 = (MotorBike) context.getBean("motorbike1");
		System.out.println(bike1);
		context.registerShutdownHook();
	}

}
