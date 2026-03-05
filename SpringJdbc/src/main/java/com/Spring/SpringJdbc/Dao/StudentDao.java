package com.Spring.SpringJdbc.Dao;

import java.util.List;

import com.Spring.SpringJdbc.Entities.Student;

public interface StudentDao {
	public int insert(Student student);
	public int update(Student student);
	public int delete(int id);
	public Student readOne(int  studentId);
	public List<Student> reaMultiple();
	
}
