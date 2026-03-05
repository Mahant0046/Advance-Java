package com.SpringCore.LifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class College implements InitializingBean,DisposableBean{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Before You Going to "+this.name);
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("After You Going to "+this.name);
		
	}

	@Override
	public String toString() {
		return "College [name=" + name + "]";
	}
	
	
	
	
}
