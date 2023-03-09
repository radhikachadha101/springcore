package springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
//		ApplicationContext config = new ClassPathXmlApplicationContext("springcore/ref/config.xml");
		
		//property
//		A obj = (A) config.getBean("aref");
//		A obj1 = (A) config.getBean("a1ref");
//
//		System.out.println(obj);
//		System.out.println(obj1);
		
		//constructor
		
		AbstractApplicationContext config = new ClassPathXmlApplicationContext("springcore/ref/config.xml");

		A obj2 = (A) config.getBean("aref");
		System.out.println(obj2);
		config.registerShutdownHook();
		

	}

}
