package com.jmc.creational_patterns.prototype_pattern.objects;

public class Rectangle extends Shape{

	public Rectangle(){
	     type = "Rectangle";
	   }
	
	@Override
	void draw() {
		System.out.println("Inside Rectangle::draw() method.");
		
	}

}
