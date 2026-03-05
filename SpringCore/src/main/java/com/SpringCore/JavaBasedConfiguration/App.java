package com.SpringCore.JavaBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
 public static void main(String[] args) {
	
	 ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
	 Employee e=context.getBean(Employee.class);
	 System.out.println(e);
}
}
