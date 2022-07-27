package com.javaindemand.javaindemand.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaindemand.javaindemand.student.Gender;
import com.javaindemand.javaindemand.student.Student;

@RestController
@RequestMapping("students")
public class StudentController {
	
	@GetMapping
	public List<Student> getAllStudents(){
		return List.of(new Student(UUID.randomUUID(), "Prince","dev", "emailce@gmail.com", Gender.MALE),
				new Student(UUID.randomUUID(), "Prince","dev", "emailce@gmail.com", Gender.MALE));
	}

}
