package com.spring.main.app;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

	private final StudentDao das;

	public StudentService(StudentDataAccessService das)
	{
		this.das = das;
	}

	public List<Student> getAllStudents()
	{
		return das.selectAllStudent();
	}
	public Optional<Student> getAllStudentsByID(Integer id)
	{
		return das.selectStudentByID(id);
	}
}
