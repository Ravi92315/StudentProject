package com.student.layer4;

import java.util.List;


import com.student.layer2.StudentTable;

public interface StudentService {
	
	public List<StudentTable> getStudents();
	public List<StudentTable> getStudentsAll();
	public StudentTable addStudent(StudentTable std);
	public void deleteStudent(int sId);
	public StudentTable updateStudent(StudentTable std);
	public List<StudentTable> getAllStudents();

	

}
