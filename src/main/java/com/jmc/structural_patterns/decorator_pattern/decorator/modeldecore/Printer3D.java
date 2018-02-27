package com.jmc.structural_patterns.decorator_pattern.decorator.modeldecore;

import com.jmc.structural_patterns.decorator_pattern.decorator.PrinterDecorator;
import com.jmc.structural_patterns.decorator_pattern.interfaces.IPrinter;

/**
 * Extends decorator class: PrinterDecorator
 *
 */

public class Printer3D extends PrinterDecorator {

	public Printer3D(IPrinter decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void print() {
		System.out.println("3D.");
		decoratedIPrinter.print();
	}

}
