package com.SpringCore.JavaBasedConfiguration;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	@Value("Ramesh")
	private String Name;
	private Department dno;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Department getDno() {
		return dno;
	}
	public void setDno(Department dno) {
		this.dno = dno;
	}
	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", dno=" + dno + "]";
	}
	
	
	
	
	
	
}
