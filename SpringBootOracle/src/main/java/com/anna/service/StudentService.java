package com.anna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anna.component.Student;
import com.anna.repository.StudentRepository;


@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository ;
	
	public List<Student> getStudent()
	{
		
		return (List<Student>) studentRepository.findAll();
	}
	public void saveStudent(Student student)
	{
		studentRepository.save(student);
	}

}
