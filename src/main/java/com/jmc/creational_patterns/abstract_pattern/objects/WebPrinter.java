package com.jmc.creational_patterns.abstract_pattern.objects;

import com.jmc.creational_patterns.abstract_pattern.interfaces.IPrinter;

public class WebPrinter implements IPrinter {

	public void print() {
		System.out.println("web");
	}
}
