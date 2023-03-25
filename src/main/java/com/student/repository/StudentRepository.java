package com.student.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.student.entity.StudentEntity;

@Repository
public interface StudentRepository extends CrudRepository<StudentEntity, Long>{

}
