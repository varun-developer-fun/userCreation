package com.spring.main.app;

import java.util.List;
import java.util.Optional;

public interface StudentDao {

	List<Student> selectAllStudent();

	Optional<Student> selectStudentByID(Integer id);
}
