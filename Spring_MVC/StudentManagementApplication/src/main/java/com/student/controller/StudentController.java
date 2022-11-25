package com.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.services.IStudentService;

@RestController
public class StudentController {

	@Autowired
	IStudentService studentService;

	@PostMapping("/addstudent")
	Integer createStudent(@RequestBody Student student) {

		Integer id = studentService.saveStudent(student);
		System.out.println(id);
		return id;

	}

	@GetMapping("/student/{id}")
	public Optional<Student> getStudent(@PathVariable Integer id) {
		Optional<Student> student = studentService.getStudent(id);
		return student;
	}

	@GetMapping("/allstudents")
	public List<Student> getAllStudents() {
		List<Student> allStudents = studentService.getAllStudents();
		return allStudents;
	}

	@DeleteMapping("/remove/{id}")
	public ResponseEntity<Student> deleteStudent(@PathVariable Integer id) {
		System.out.println(id);
		ResponseEntity<Student> responseEntity = new ResponseEntity<>(HttpStatus.OK);
		try {
			studentService.deleteStudent(id);

		} catch (Exception e) {
			e.printStackTrace();

			responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);

		}

		return responseEntity;

	}
	
	@PutMapping("update/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable Integer id, @RequestBody Student student){
		return new ResponseEntity<Student>(studentService.updateStudent(student, id), HttpStatus.OK);
	}

}
