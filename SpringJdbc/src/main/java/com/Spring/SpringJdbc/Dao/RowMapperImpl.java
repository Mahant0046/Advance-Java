package com.Spring.SpringJdbc.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.Spring.SpringJdbc.Entities.Student;

public class RowMapperImpl implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student s=new Student();
		s.setName(rs.getString(1));
		s.setId(rs.getInt(2));
		s.setCity(rs.getString(3));
		s.setMarks(rs.getInt(4));
		return s;
	}

}
