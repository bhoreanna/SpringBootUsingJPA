package com.anna.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anna.component.Student;
import com.anna.service.StudentService;
@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "*")
	@RequestMapping("/")
	public void home()
	{
		System.out.println("I am in Home");
	}
	@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "*")
	@RequestMapping("/students")
	public List<Student> getStudent()
	{
		System.out.println("Size of Student List"+studentService.getStudent().size());
		return studentService.getStudent();
		
	}
	
	@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "*")
	@RequestMapping(value = "/students", method = RequestMethod.POST)
	public void saveStudent(@RequestBody Student student)
	{
		studentService.saveStudent(student);
	}
	
	

}
