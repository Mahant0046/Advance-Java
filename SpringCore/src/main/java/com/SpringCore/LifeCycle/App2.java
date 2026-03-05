package com.SpringCore.LifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringCore.SpringDI.Student;

public class App2 {

	 public static void main( String[] args )
	    {
//		    Lifecycle Using XML configuration
//	        AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/SpringCore/LifeCycle/conf.xml");
//	        Person p1=context.getBean(Person.class);
//	        System.out.println(p1);
//	        context.registerShutdownHook();
//		 	
//		 LifeCyle By Implementing Interfaces
		 AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/SpringCore/LifeCycle/conf.xml");
		 College c1=context.getBean(College.class);
		 System.out.println(c1);
		 context.registerShutdownHook();
	    }
}
