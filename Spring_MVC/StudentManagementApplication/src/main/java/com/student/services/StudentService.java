package com.student.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repository.IStudentRepository;

@Service
public class StudentService implements IStudentService{
	
	@Autowired
	IStudentRepository studentRepository; 

	@Override
	public Integer saveStudent(Student student) {
		Student savedStudent = studentRepository.save(student);
		return savedStudent.getsId();
	}

}
