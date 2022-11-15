package com.learn.core.SpringCoreDemo.ReferenceInjectionTest;

public class StudentDetails {
	private String studentName;
	private String studentClass;
	private int studentAge;
	private String studentCity;
	private StudentSubjects subjects;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	public StudentSubjects getSubjects() {
		return subjects;
	}
	public void setSubjects(StudentSubjects subjects) {
		this.subjects = subjects;
	}
	public StudentDetails(String studentName, String studentClass, int studentAge, String studentCity,
			StudentSubjects subjects) {
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.studentAge = studentAge;
		this.studentCity = studentCity;
		this.subjects = subjects;
	}
	public StudentDetails() {
		super();
	}
	@Override
	public String toString() {
		return "StudentDetails [studentName=" + studentName + ", studentClass=" + studentClass + ", studentAge="
				+ studentAge + ", studentCity=" + studentCity + ", subjects=" + subjects + "]";
	}
	
	

}
