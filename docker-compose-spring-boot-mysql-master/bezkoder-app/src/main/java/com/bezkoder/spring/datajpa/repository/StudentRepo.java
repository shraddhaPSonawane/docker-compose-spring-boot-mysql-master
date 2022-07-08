package com.bezkoder.spring.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.spring.datajpa.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

	
}
