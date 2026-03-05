package com.SpringCore.StereotypeAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/SpringCore/StereotypeAnnotations/config.xml");
		SpringBoot s1=context.getBean(SpringBoot.class);
		SpringBoot s2=context.getBean(SpringBoot.class);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
	
}
