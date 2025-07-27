package com.example.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.college.entity.Student;

public interface CollegeRepo extends JpaRepository<Student,Integer>{
	

}
