package com.SpringCore.SpringDI;

public class Student {
	private String Name;
	private String Course;
	private int Age;
	private Address Add;
	

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
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", Course=" + Course + ", Age=" + Age + ", Add=" + Add + "]";
	}
	
	
	
	
}
