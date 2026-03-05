package com.SpringCore.SpringDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("com/SpringCore/SpringDI/config.xml");
    	Student s1=context.getBean(Student.class);
        Student s2=context.getBean(Student.class);
        s2.setName("Ramesh");
        System.out.println(s1);
        System.out.println(s2);
        
       
    }
}
