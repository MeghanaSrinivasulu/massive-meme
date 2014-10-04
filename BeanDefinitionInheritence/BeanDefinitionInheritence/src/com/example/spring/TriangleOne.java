package com.example.spring;

import java.util.List;

import com.example.spring.Line;

public class TriangleOne {

	private List<Line> lines;

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
}
