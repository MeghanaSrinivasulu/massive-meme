package com.example.spring;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape{
private Point center;

public Point getCenter() {
	return center;
}

@Required
public void setCenter(Point center) {
	this.center = center;
}

@Override
public void draw() {
	// TODO Auto-generated method stub
	System.out.println("Drawing circle");
	System.out.println("canter is"+center.getX()+","+center.getY());
}


}
