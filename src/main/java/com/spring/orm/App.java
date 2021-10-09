package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!nnnn");
		System.out.println("Hello World!nnnn");
		ApplicationContext contex = new ClassPathXmlApplicationContext("config.xml");
		System.out.println("Hello World!nnn222");
		StudentDao studentDao = contex.getBean("studentDao", StudentDao.class);
		System.out.println("Hello World!3333");
		Student student = new Student(1233, "sushrut mahajan", "bhusawal");
		System.out.println("Hello World4444");
		int r = studentDao.insert(student);
		System.out.println("done" + r);

	}
}
