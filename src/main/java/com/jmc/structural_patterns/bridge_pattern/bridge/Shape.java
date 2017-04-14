package com.jmc.structural_patterns.bridge_pattern.bridge;

import com.jmc.structural_patterns.bridge_pattern.interfaces.IPrinter;

public abstract class Shape {

	protected IPrinter print;

	protected Shape(IPrinter printerShape) {
		this.print = printerShape;
	}

	public abstract void draw();

}
