package com.student.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.layer2.StudentTable;
import com.student.layer4.StudentService;



@RestController
public class MyController {
	
	@Autowired
	private StudentService studentservice;

	@GetMapping("/home")
	public List<StudentTable> getStudents(){
		return this.studentservice.getStudentsAll();
	}
	
	
	
	@GetMapping("/students")
	public List<StudentTable> getStudentss(){
		
		return this.studentservice.getStudents();
		
	}
	
	@PostMapping("/student")
	public StudentTable addStudent(StudentTable std) {
		return this.studentservice.addStudent(std);
	}
	
	@DeleteMapping("/students/{sId}")
	public void deleteStudent(@PathVariable int sId) {
		
		this.studentservice.deleteStudent(sId);
		
	}
	
	@PutMapping("/students")
	public StudentTable updateStudent(StudentTable std) {
		return this.studentservice.updateStudent(std);
	}
	
	@GetMapping("/byname")
	public List<StudentTable> getAllStudents() {
//		List<StudentTable> studentResponse = (List<StudentTable>) studentservice.getAllStudents();
		
		return this.studentservice.getAllStudents();
	}
	

	
	

	
	
}
