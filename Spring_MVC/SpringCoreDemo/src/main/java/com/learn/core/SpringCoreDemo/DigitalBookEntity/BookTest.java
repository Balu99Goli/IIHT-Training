package com.learn.core.SpringCoreDemo.DigitalBookEntity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/com/learn/core/SpringCoreDemo/DigitalBookEntity/config.xml");
		Book book1 = (Book) context.getBean("book1");
		System.out.println(book1);
	}

}
