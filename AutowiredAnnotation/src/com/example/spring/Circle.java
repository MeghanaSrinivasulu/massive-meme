package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape{
private Point center;

public Point getCenter() {
	return center;
}

//Order of autowiring is first by type, then by name(Ex:center here) and then it checks the qualifiers
@Autowired 
@Qualifier("circleIdentifier")
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
