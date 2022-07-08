package com.bezkoder.spring.datajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.spring.datajpa.model.Student;
import com.bezkoder.spring.datajpa.repository.StudentRepo;

@RestController
public class StudentController {

	@Autowired
	private StudentRepo studentRepo;
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		return studentRepo.findAll();
	}
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) {
		return studentRepo.save(student);
	}
	
	
	@GetMapping("/students/{id}")
	public Student addStudent(@PathVariable Integer id) {
		return studentRepo.findById(id).orElse(new Student());
	} 
}
