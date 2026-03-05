package com.Spring.SpringJdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.Spring.SpringJdbc.Dao.StudentDaoimpl;

@Configuration
public class javaConfig {

	@Bean("ds")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/students");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	@Bean("studentDao")
	public StudentDaoimpl getStudentDao() {
		StudentDaoimpl sd=new StudentDaoimpl();
		sd.setJdbcTemplate(getJdbcTemplate());
		return sd;
	}
}
