package com.jmc.structural_patterns.decorator_pattern.interfaces.impl;

import com.jmc.structural_patterns.decorator_pattern.interfaces.IPrinter;

public class PaperPrinterImpl implements IPrinter {

	public void print() {
		System.out.println("Paper Printer");

	}

}
