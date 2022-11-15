package com.learn.core.SpringCoreDemo.ReferenceInjectionTest;

import java.util.List;

public class StudentSubjects {
	private List<String> Subjects;

	public List<String> getSubjects() {
		return Subjects;
	}

	public void setSubjects(List<String> subjects) {
		Subjects = subjects;
	}

	public StudentSubjects(List<String> subjects) {
		super();
		Subjects = subjects;
	}

	public StudentSubjects() {
		super();
	}

	@Override
	public String toString() {
		return "StudentSubjects [Subjects=" + Subjects + "]";
	}
	
	

}
