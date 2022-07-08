package com.mysql.docker.mysqldemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mysql.docker.mysqldemo.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

	
}
