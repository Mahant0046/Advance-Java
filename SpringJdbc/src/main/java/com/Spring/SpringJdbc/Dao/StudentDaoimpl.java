package com.Spring.SpringJdbc.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.Spring.SpringJdbc.Entities.Student;

public class StudentDaoimpl implements StudentDao{

	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insert(Student student) {
		String sql="insert into stud (name,id,city,marks) values(?,?,?,?)";
		int r=jdbcTemplate.update(sql,student.getName(),student.getId(),student.getCity(),student.getMarks());
		return r;
	}

	@Override
	public int update(Student student) {
		String sql="update stud set marks=?,city=? where id=?";
		int r=jdbcTemplate.update(sql,student.getMarks(),student.getCity(),student.getId());
		return r;
	}

	@Override
	public int delete(int id) {
		String sql="delete from stud where id=?";
		int r=jdbcTemplate.update(sql,id);
		return r;	
	}
	
	@Override
	public Student readOne(int studentId) {
		String sql="select * from stud where id=?";
		Student s=jdbcTemplate.queryForObject(sql,new RowMapperImpl() ,studentId);
		return s;
	}

	@Override
	public List<Student> reaMultiple() {
		String sql="select * from stud ";
		List<Student> students=jdbcTemplate.query(sql,new RowMapperImpl());
		return students;
	}


	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public String toString() {
		return "StudentDaoimpl [jdbcTemplate=" + jdbcTemplate + "]";
	}

	
}
