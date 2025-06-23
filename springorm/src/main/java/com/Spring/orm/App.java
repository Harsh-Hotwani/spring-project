package com.Spring.orm;

import java.io.ObjectInputFilter.Config;
import java.util.Scanner;

import javax.swing.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring.orm.dao.StudentDao;
import com.Spring.orm.dao.StudentDaoImpl;
import com.Spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanner = new Scanner(System.in);
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/Spring/orm/Config.xml");
       StudentDao sDao = applicationContext.getBean("studentDao",StudentDao.class);
       
		System.out.println("press 1 to enter a data");
		System.out.println("press 2 to get a data");
		System.out.println("press 3 to delete a data");
		System.out.println("press 4 to update a data");
		
		int input = scanner.nextInt();
		
		switch (input) {
		case 1: Student student = new Student();
				student.setStudentId(12);
				student.setStudentName("ajay");
				student.setStudentCity("hyd");
				sDao.insert(student);
			break;

		case 2: int dlt = scanner.nextInt();
				sDao.delete(dlt);
			break;
			
	
		default:
			break;
		} {
			
		}
       
    }
}
