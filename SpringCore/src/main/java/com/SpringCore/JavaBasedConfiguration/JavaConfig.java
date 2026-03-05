package com.SpringCore.JavaBasedConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.SpringCore.JavaBasedConfiguration")
public class JavaConfig {
	
	@Bean
	public Department  getDepartment() {
		Department d=new Department();
		return d;
	}
	
	@Bean(name= {"e1","e2","e3"})
	public Employee getEmployee() {
		Employee e=new Employee();
		e.setDno(getDepartment());
		return e;
	}
}
