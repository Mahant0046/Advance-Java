package com.Spring.SpringJdbc.Entities;

public class Student {

	private String name;
	private int id;
	private String city;
	private int marks;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}
	
	
	
	
}
