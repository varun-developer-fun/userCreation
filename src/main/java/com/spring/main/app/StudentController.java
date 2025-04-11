package com.spring.main.app;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	private final StudentService studentservice;

	public StudentController(StudentService studentservice)
	{
		this.studentservice = studentservice;
	}

	@PostMapping("/v2/allstudents")
	public List<Student> allStudents()
	{
		return studentservice.getAllStudents();
	}

	@PostMapping("/v2/allstudents/{studentId}")
	public Optional<Student> allStudentsByID(@PathVariable("studentId") Integer id)
	{
		return studentservice.getAllStudentsByID(id);
	}

	@GetMapping("/")
	public String home()
	{
		return "home";
	}

}
