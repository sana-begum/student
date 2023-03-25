package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.StudentEntity;
import com.student.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService service; // object

	@PostMapping("/saveData")
	public StudentEntity saveStudentData(@RequestBody StudentEntity entity) {
		System.out.println("saved successfully");
		return service.saveStudentData(entity);
	}
}
