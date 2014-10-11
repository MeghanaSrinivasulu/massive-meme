package com.example.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class DrawingApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
       AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	   
		
	/*	Shape shape = (Shape)context.getBean("triangle");
		shape.draw();*/
		
		Shape shp = (Shape) context.getBean("Circle");
		shp.draw();

	}

}

