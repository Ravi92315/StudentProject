package com.student.layer2;

import java.io.Serializable;
import javax.persistence.*;





@Entity
@Table(name="STUDENT_TABLE")
public class StudentTable implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SID")
	private int sId;

	@Column(name="NAME")
	private String Name;
	
	@Column(name="DEPT")
	private String Dept;
	
	@Column(name="MARKS")
	private int Marks;
	
	@Column(name="COLLAGE")
	private String Collage;

	

	

	





	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

	public int getMarks() {
		return Marks;
	}

	public void setMarks(int marks) {
		Marks = marks;
	}

	public String getCollage() {
		return Collage;
	}

	public void setCollage(String collage) {
		Collage = collage;
	}

	

	
	
	

}