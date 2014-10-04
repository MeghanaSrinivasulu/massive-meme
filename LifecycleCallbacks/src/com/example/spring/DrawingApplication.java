package com.example.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class DrawingApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Triangle triangle = new Triangle();
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		/*ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		
		Triangle triangle1 = (Triangle)context.getBean("triangle1");
		triangle1.draw();
		
		Triangle triangle2 = (Triangle)context.getBean("triangle2");
		triangle2.draw();*/
		
       AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	   context.registerShutdownHook(); //this is called when main method ends and the spring container destroys all the beans	
		
		Triangle triangle1 = (Triangle)context.getBean("triangle1");
		triangle1.draw();

	}

}

