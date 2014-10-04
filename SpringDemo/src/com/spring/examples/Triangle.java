package com.spring.examples;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware,BeanNameAware {

	/*Line xy;
	Line yz;
	Line xz;*/
	
	private List<Line> lines;
	private ApplicationContext context;
	



	public List<Line> getLines() {
		return lines;
	}




	public void setLines(List<Line> lines) {
		this.lines = lines;
	}




	public void draw(){
		
		for(Line line:lines){
			System.out.println("Line is" + line.getX()+","+line.getY());
			
		}
		
	}




	@Override
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		System.out.println("bean name is:"+ beanName);
		
	}




	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("context is:"+context);
		this.context = context;
		
	}

}
