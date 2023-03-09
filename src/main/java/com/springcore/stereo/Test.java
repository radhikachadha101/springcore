package com.springcore.stereo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ApplicationContext config =	new ClassPathXmlApplicationContext("com/springcore/stereo/config.xml");

	//ways
			Student student1 = (Student) config.getBean("student");
//			Student student2 = config.getBean("student",Student.class);
			
			

	
	System.out.println(student1);
	
	}

}
