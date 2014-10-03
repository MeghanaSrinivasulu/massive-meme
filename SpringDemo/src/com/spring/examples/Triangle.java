package com.spring.examples;

public class Triangle {

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

}
