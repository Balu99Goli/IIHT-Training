package com.learn.core.SpringCoreDemo.ReferenceInjectionTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.core.SpringCoreDemo.ReferenceInjection.Object1;

public class RefTest2 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/learn/core/SpringCoreDemo/ReferenceInjectionTest/RefTestConfig.xml");
		StudentDetails studentDet =(StudentDetails) context.getBean("student1");
		System.out.println(studentDet);
		System.out.println(studentDet.getSubjects());
		// TODO Auto-generated method stub

	}

}
