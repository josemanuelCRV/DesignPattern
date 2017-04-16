package com.jmc.creational_patterns.prototype_pattern.models;

/**
 * Then it creates three concrete classes extending the Shape class.
 */
public class Circle extends Shape {

	public Circle() {
		type = "Circle";
	}

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}
