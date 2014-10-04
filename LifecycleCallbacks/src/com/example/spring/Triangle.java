package com.example.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/*InitializingBean and DisposableBean are marker interfaces
 * InitializingBean gives an indication that the method is called after all the properties are set
 * DisposableBean is called before the bean is destroyed
 */
public class Triangle implements InitializingBean,DisposableBean {

	Line xy;
	Line yz;
	Line xz;
	
	

	
	public Line getXy() {
		return xy;
	}




	public void setXy(Line xy) {
		this.xy = xy;
	}




	public Line getYz() {
		return yz;
	}




	public void setYz(Line yz) {
		this.yz = yz;
	}




	public Line getXz() {
		return xz;
	}




	public void setXz(Line xz) {
		this.xz = xz;
	}




	public void draw(){
		System.out.println("Line xy is" + getXy().getX()+","+getXy().getY());
		System.out.println("Line yz is" + getYz().getX()+","+getYz().getY());
		System.out.println("Line xz is" + getXz().getX()+","+getXz().getY());
	}




	@Override
	public void destroy() throws Exception {
		System.out.println("Before destruction");
		
	}



/*
 * If we implement both the ways of calling lifecycle callback methods, implementing marker interfaces and specifying in spring.xml, then
 * the methods of the marker interfaces are called first and then the custom methods which is specified in spring.xml
 * 
 */
	@Override
	public void afterPropertiesSet() throws Exception {
	 	
	   System.out.println("After properties are set");
	}
	
	public void myInit()
	{
		System.out.println("Inside myInit");
	}
	
	public void cleanUp()
	{
		System.out.println("Inside cleanUp");
	}

}
