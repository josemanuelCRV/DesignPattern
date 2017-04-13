package com.jmc.creational_patterns.abstract_pattern.factory;

/**
 * 
 * Create a Factory generator/producer class to get factories by passing an
 * information such as Shape or Printer
 *
 */
public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("Printer")) {
			return new PrinterFactory();
		}
		return null;
	}
}