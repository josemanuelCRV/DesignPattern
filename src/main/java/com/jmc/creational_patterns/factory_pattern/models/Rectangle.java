package com.jmc.creational_patterns.factory_pattern.models;

import com.jmc.creational_patterns.factory_pattern.interfaces.IShape;

public class Rectangle implements IShape {

	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}

}
