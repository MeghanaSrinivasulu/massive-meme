package com.spring.examples;

public class Line {
private int x;
private int y;
private static int count=0;
public Line(){
	count++;
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public static int getCount() {
	return count;
}
public static void setCount(int count) {
	Line.count = count;
}

}
