package com.student.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.student.entity.Student;

public interface IStudentService {

	Integer saveStudent(Student student);

	Optional<Student> getStudent(Integer id);

	public List<Student> getAllStudents();
	
	public void deleteStudent(Integer id);
	
	public Student updateStudent(Student student, Integer id);

}
