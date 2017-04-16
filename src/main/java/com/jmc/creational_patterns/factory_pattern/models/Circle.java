package com.jmc.creational_patterns.factory_pattern.models;

import com.jmc.creational_patterns.factory_pattern.interfaces.IShape;

public class Circle implements IShape{

	public void draw() {
		System.out.println("Inside Circle::draw() method.");
		
	}

}
