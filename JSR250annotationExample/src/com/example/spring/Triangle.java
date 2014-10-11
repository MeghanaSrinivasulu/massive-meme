package com.example.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/*InitializingBean and DisposableBean are marker interfaces
 * InitializingBean gives an indication that the method is called after all the properties are set
 * DisposableBean is called before the bean is destroyed
 */
public class Triangle implements Shape {

	Point pointA;
	Point pointB;
	Point pointC;
	
	

	
	



	public Point getPointA() {
		return pointA;
	}








	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}








	public Point getPointB() {
		return pointB;
	}








	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}








	public Point getPointC() {
		return pointC;
	}








	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}








	public void draw(){
		System.out.println("Drawing Triangle");
		System.out.println("Point A is:" + pointA.getX()+","+pointA.getY());
		System.out.println("Point B is" + pointB.getX()+","+pointB.getY());
		System.out.println("Point C is" + pointC.getX()+","+pointC.getY());
	}






}
