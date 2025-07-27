package com.example.college.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.college.entity.Student;
import com.example.college.service.StudentService;

@RestController

public class Controller {
	@Autowired
	private StudentService eser;
	@PostMapping("/addclg")
	public Student regstud(@RequestBody Student stud) {
		return eser.addStud(stud);
	}
	@GetMapping("/getstud")
	public List<Student> getStudent() {
		return eser.getstud();
	}
	  @PutMapping("/updateemp")
	public Student updateStudent(@RequestBody Student stud) {
		return eser.updateStud(stud);
			
	}
	  @DeleteMapping("/deletestud/{id}")
	  public void deleteStudent(@PathVariable Integer id) {
		  eser.deleteStud(id);
	  }

}
