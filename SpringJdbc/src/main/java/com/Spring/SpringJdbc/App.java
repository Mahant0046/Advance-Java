package com.Spring.SpringJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.Spring.SpringJdbc.Dao.StudentDao;
import com.Spring.SpringJdbc.Dao.StudentDaoimpl;
import com.Spring.SpringJdbc.Entities.Student;

import java.util.List;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    
	  
	  //XML BASED CONFIGURATION
	  ApplicationContext context=new ClassPathXmlApplicationContext("com/Spring/SpringJdbc/config.xml");
	  StudentDao studentDao=context.getBean("studentDao",StudentDaoimpl.class);
	  Scanner sc=new Scanner(System.in);
	  
	  
	  //JAVA BASED CONFIGURATION
//	  ApplicationContext context=new AnnotationConfigApplicationContext(javaConfig.class);
//	  StudentDao studentDao=context.getBean("studentDao",StudentDaoimpl.class);
//	  Scanner sc=new Scanner(System.in);
// 
	  
//	  System.out.println("Enter student Details");
//	  Student s=new Student();
//	  System.out.println("Student Name :");
//	  s.setName(sc.next());
//	  System.out.println("Student id :");
//	  s.setId(sc.nextInt());
//	  System.out.println("Student city :");
//	  s.setCity(sc.next());
//	  System.out.println("Student Marks :");
//	  s.setMarks(sc.nextInt());
//	  System.out.println();
//	  
//	  
//	  //inserting student
//	  int result=studentDao.insert(s);
//	  System.out.println("Rows Inserted"+result);
//	  
	  
	  //updating the student
//	  int result=studentDao.update(s);
//	  System.out.println("Rows Updated" +result);
//	  
	  
	  //Deleting the student with id
//	  int result=studentDao.delete(13);
//	  System.out.println("Rows Deleted "+result);
//	  
//	  
//	  //selecting single student
//	  Student stud=studentDao.readOne(20);
//	  System.out.println(stud);
//	  
	  //Selecting multiple students
	  List<Student> stud=studentDao.reaMultiple();
	  for(Student s:stud) {
		  System.out.println(s);
	  }

	  sc.close();
  }
}
