package com.jmc.structural_patterns.bridge_pattern.objects;

import com.jmc.structural_patterns.bridge_pattern.interfaces.IPrinter;

public class ColorPrinter implements IPrinter {

	public void print(int radius, int x, int y) {
		System.out.println("Color: " + radius + ", x: " + x + ", " + y + "]");
	}

	
}
