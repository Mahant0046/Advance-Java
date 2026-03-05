package com.SpringDI.Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String args[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/SpringDI/Autowire/config.xml");
		Employee emp1=(Employee)context.getBean("emp");
		System.out.println(emp1);
	
	}

}
