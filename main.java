package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
		Student std=(Student)con.getBean("rcb");
		System.out.println(std);

	}

}
