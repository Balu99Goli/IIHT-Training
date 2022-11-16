package com.learn.core.SpringCoreDemo.ConstructorInjection;

public class Person {
	private String name;
	private int personId;
	private Certificate certificate;

	public Person(String name, int personId ,Certificate certificate) {

		this.name = name;
		this.personId = personId;
		this.certificate=certificate;
	}

	@Override
	public String toString() {
		return "Person [name=" + this.name + ", personId=" + this.personId + ", certificate=" + this.certificate.name + "]";
	}

	

}
