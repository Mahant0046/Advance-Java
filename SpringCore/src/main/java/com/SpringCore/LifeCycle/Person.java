package com.SpringCore.LifeCycle;

public class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public void init() {
		System.out.println("Before Meting The "+this.name);
	}
	
	public void destroy() {
		System.out.println("After Meting The "+this.name);
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
}
