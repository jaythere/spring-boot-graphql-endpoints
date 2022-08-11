package com.graphql.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("James", "Charles");
	}
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		students.add(new Student("James", "Charles"));
		students.add(new Student("David", "Graham"));
		return students;
	}

}
