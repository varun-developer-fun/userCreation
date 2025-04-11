package com.spring.main.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.spring.main.exception.UserNotFoundException;

@Repository
public class StudentDataAccessService implements StudentDao {

private static List<Student> students;

	static {
		students = new ArrayList<>();

		Student varun = new Student(1, "Varun", "Chennai");
		Student kamala = new Student(2, "Kamala", "Virudhunagar");
		Student kavya = new Student(3, "Kavya", "Chennai");

		students.add(varun);
		students.add(kamala);
		students.add(kavya);
	}

	@Override
	public List<Student> selectAllStudent() {

		return students;
	}

	@Override
	public Optional<Student> selectStudentByID(Integer id) {
		for (Student student : students) {
			if (student.getId().equals(id)) {
				return Optional.of(student);
			}
		}
		throw new UserNotFoundException("Invalid id "+ id);
	}

}
