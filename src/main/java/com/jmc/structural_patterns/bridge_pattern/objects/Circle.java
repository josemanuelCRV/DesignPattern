package com.jmc.structural_patterns.bridge_pattern.objects;

import com.jmc.structural_patterns.bridge_pattern.bridge.Shape;
import com.jmc.structural_patterns.bridge_pattern.interfaces.IPrinter;

public class Circle extends Shape {

	// invoke implicit super constructor Shape() +  Must define an explicit constructor

	public Circle(int x, int y, int radius, IPrinter printerShape) {
		super(printerShape); // invoke implicit super constructor Shape()
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	private int x, y, radius;

	@Override
	public void draw() {
		print.print(radius, x, y);
	}

}
