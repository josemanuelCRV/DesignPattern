package com.jmc.structural_patterns.decorator_pattern.decorator;

import com.jmc.structural_patterns.decorator_pattern.interfaces.IPrinter;

/**
 * This abstract decorator class wrap the original class and provides additional
 * functionality.
 * <br><br>
 * Decorator: mantiene una referencia al objeto IPrinter y define una interface
 * de acuerdo con la interface de IPrinter.
 * 
 * @author josem
 *
 */
public abstract class PrinterDecorator implements IPrinter {

	// reference to interface
	protected IPrinter decoratedIPrinter;

	// Constructor receive a type IPrinter
	public PrinterDecorator(IPrinter d) {
		this.decoratedIPrinter = d;
	}

	// @Impl IPrinter
	public void print() {
		decoratedIPrinter.print();
	}

}
