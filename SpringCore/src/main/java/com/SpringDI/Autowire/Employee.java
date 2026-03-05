package com.SpringDI.Autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	private String Name;
	@Autowired
	@Qualifier("Add2")
	private Address Add;
	

	public Employee() {
		super();
	}

	public Employee(String name, Address add) {
		Name = name;
		Add = add;
	}

	public Address getAdd() {
		return Add;
	}

	public void setAdd(Address add) {
		Add = add;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Add=" + Add + "]";
	}

	
	
}
