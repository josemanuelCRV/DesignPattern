package com.jmc.creational_patterns.prototype_pattern.models;

public class Square extends Shape {

	public Square() {
		type = "Square";
	}

	@Override
	void draw() {
		System.out.println("Inside Square::draw() method.");
	}

}
