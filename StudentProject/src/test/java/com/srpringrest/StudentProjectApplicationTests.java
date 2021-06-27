package com.srpringrest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.student.layer2.StudentTable;
import com.student.layer3.StudentRepository;


@SpringBootTest
class StudentProjectApplicationTests {
	
	@Autowired
	StudentRepository sRepo;

//	@Test
////	void addStudentTest() {
////		System.out.println("///////////////////////////////////////////////");
////		StudentTable sdt=new StudentTable();
////		sdt.setName("Ravi");
////		sdt.setDept("C.S.E");
////		sdt.setMarks((long) 90);
////		sdt.setCollage("S.M.I.T");
////		sRepo.addStudent(sdt);
////		System.out.println("///////////////////////////////////////////////");
////		
//	}

}
