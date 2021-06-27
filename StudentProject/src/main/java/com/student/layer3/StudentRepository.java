package com.student.layer3;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.student.layer2.StudentTable;
@Repository
public interface StudentRepository extends JpaRepository<StudentTable, Integer> {

	
}
