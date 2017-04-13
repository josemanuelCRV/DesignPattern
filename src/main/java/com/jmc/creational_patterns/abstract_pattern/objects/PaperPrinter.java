package com.jmc.creational_patterns.abstract_pattern.objects;

import com.jmc.creational_patterns.abstract_pattern.interfaces.IPrinter;

/**
 * Create concrete classes implementing the Printer interface
 */
public class PaperPrinter implements IPrinter {

	public void print() {
		System.out.println("paper");
	}
}