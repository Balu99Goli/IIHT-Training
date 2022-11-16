package com.learn.core.SpringCoreDemo.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/learn/core/SpringCoreDemo/ConstructorInjection/PersonConfig.xml");
		Person p1 = (Person) context.getBean("person1") ;
		System.out.println(p1);
		
		Person p2 = (Person) context.getBean("person2") ;
		System.out.println(p2);
		
		Person p3 = (Person) context.getBean("person3") ;
		System.out.println(p3);
		
		Addition add1 = (Addition)context.getBean("add1");
		add1.doSum();

	}

}
