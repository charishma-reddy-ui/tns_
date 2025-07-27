package com.example.college.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.college.entity.Student;
import com.example.college.repository.CollegeRepo;

//CRUD operational methods
@Service

public class StudentService {
	
	@Autowired
	private CollegeRepo erepo;
	public Student addStud(Student stud) {
		return erepo.save(stud);
		
	}
	public List<Student> getstud(){
		return erepo.findAll();
	}
	public Student updateStud(Student stud) {
		Integer sid = stud.getSid();
		Student stud1 = erepo.findById(sid).get();
		stud1.setSid(stud.getSid());
		stud1.setCollegeadmin(stud.getCollegeadmin());
		stud1.setCollegename(stud.getCollegename());
		stud1.setLocation(stud.getLocation());
		return erepo.save(stud1);
		}
	public void deleteStud(int sid) {
		erepo.deleteById(sid);
	}

	
	
	
	

}
