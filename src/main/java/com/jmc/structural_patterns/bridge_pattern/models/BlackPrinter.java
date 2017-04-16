package com.jmc.structural_patterns.bridge_pattern.models;

import com.jmc.structural_patterns.bridge_pattern.interfaces.IPrinter;

public class BlackPrinter implements IPrinter {

	public void print(int radius, int x, int y) {
		System.out.println("Black: " + radius + ", x: " + x + ", " + y + "]");
	}

}
