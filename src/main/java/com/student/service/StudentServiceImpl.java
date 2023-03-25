package com.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.StudentEntity;
import com.student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public StudentEntity saveStudentData(StudentEntity entity) {
		// TODO Auto-generated method stub
		String name = entity.getStudentName();
		String temp = "";
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			temp = ch + temp;
		}
		entity.setStudentName(temp);
		return studentRepository.save(entity);
	}

}
