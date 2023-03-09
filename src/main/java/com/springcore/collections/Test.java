package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext config = new ClassPathXmlApplicationContext("com/springcore/collections/config.xml");
		
		Emp emp1 = (Emp) config.getBean("emp1");
		System.out.println(emp1);
		

	}

}
