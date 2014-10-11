package com.example.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

//other stereotype equivalents to component is @Service, @Controller, @Repository --> specifies the role of the bean and has other added advantages
@Component//notifies spring that this is a bean and needs to be initialized.This bean need not be declared in spring.xml
public class Circle implements Shape{
private Point center;

public Point getCenter() {
	return center;
}

//JSR 250 annotation -- this is a standard (java specification request)--these annotations are from javax and not specific to spring
@Resource(name = "zeroPoint")
public void setCenter(Point center) {
	this.center = center;
}

//JSR 250 annotation
@PostConstruct//After initializing bean -- this is used instead of specifying default init method and default destroy method in spring.xml
public void initializeCircle(){
	System.out.println("initializing circle");
}

//JSR 250 annotation
@PreDestroy//After initializing bean -- this is used instead of specifying default init method and default destroy method in spring.xml
public void destroy(){
	System.out.println("destruction!!!");
}
@Override

public void draw() {
	// TODO Auto-generated method stub
	System.out.println("Drawing circle");
	System.out.println("center is"+center.getX()+","+center.getY());
}


}
