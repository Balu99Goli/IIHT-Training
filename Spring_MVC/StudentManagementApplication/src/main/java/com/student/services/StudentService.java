package com.student.services;

import java.util.List;
import java.util.Optional;

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

	@Override
	public Optional<Student> getStudent(Integer id) {
		
		return this.studentRepository.findById(id);
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

}
