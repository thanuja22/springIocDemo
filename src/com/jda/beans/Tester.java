package com.jda.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jda.util.Student;

public class Tester {
	public static void main(String[] args) {

		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Student student=(Student)context.getBean("studentbean");
		student.displayInfo();
	}
}
