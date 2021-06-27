package com.student.layer4; 
import java.util.ArrayList; 
import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 
import com.student.layer2.StudentTable;
import com.student.layer3.StudentRepository; 

@Service
public class StudentServiceImpl implements StudentService {
	
	
	@Autowired
	StudentRepository studenttable;
	
	@PersistenceContext
	EntityManager entityManager;
	
	List<StudentTable> list;
	List<StudentTable> s = new ArrayList<>(); 
	
	
	
	@Transactional
	public List<StudentTable > getStudents(){
		String hql ="From StudentTable s where s.Marks>80";
		Session session = entityManager.unwrap(Session.class);
		Query q = session.createQuery(hql);
		List<StudentTable> st = q.getResultList();
		return st;
	}
	
	
//	@Transactional
//	public List<StudentTable> getStudents() { 
//		
//		list= studenttable.findAll();
//		
//		//Using lamda Expression
//		list.forEach(e ->
//		{
//			if(e.getMarks()>80)
//			{
//				s.add(e);
//			}
//		
//		
//		for(StudentTable p:s) 
//		{
//			System.out.println("/////////////////////////////////////////////////////");
//			System.out.println("Student ID :"+p.getsId()); //
//			System.out.println("Student Name :"+p.getName()); //
//			System.out.println("Student Dept :"+p.getDept()); //
//			System.out.println("Student Marks :"+p.getMarks()); //
//			System.out.println("Student Collage :"+p.getCollage()); //
//			System.out.println("/////////////////////////////////////////////////////");
//		}
//		});
//		return s;}
//	
	
	//  Normal 
		 
//		for(StudentTable st:list) 
//		{ 
//			if(st.getMarks()>80)
//			{ 
//				s.add(st); 
//			}
//		}
	
	
	
		
//	for(StudentTable p:s) 
//	{
//		System.out.println("/////////////////////////////////////////////////////");
//		System.out.println("Student ID :"+p.getsId()); //
//		System.out.println("Student Name :"+p.getName()); //
//		System.out.println("Student Dept :"+p.getDept()); //
//		System.out.println("Student Marks :"+p.getMarks()); //
//		System.out.println("Student Collage :"+p.getCollage()); //
//		System.out.println("/////////////////////////////////////////////////////");
//	}
//	return s;
// 
// }
	@Transactional
	public List<StudentTable> getStudentsAll() {
		
		return studenttable.findAll();
	}


	@Transactional
	public StudentTable addStudent(StudentTable std) {
		
		return studenttable.save(std);
	}


	@Transactional
	public void deleteStudent(int sId) {
		// TODO Auto-generated method stub
		StudentTable entity=studenttable.getById(sId);
		studenttable.delete(entity);
	}


	@Transactional
	public StudentTable updateStudent(StudentTable std) {
		// TODO Auto-generated method stub
		return studenttable.save(std);
	}


	@Transactional
	public List<StudentTable> getAllStudents() {
		String hql = "FROM StudentTable s ORDER BY s.Marks desc,s.Name desc";
		Session session = entityManager.unwrap(Session.class);
		Query query = session.createQuery(hql);
		List<StudentTable> studentResponse = query.getResultList();
		return studentResponse;
	} 
	
	
	
	
	
}

	
	
	


