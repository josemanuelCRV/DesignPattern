package com.jmc.creational_patterns.abstract_pattern.factory;

import com.jmc.creational_patterns.abstract_pattern.interfaces.IPrinter;
import com.jmc.creational_patterns.abstract_pattern.interfaces.IShape;

/**
 * 5.- Create an abstract class to get factories for Printer and Shape Objects.
 * 
 *
 */
public abstract class AbstractFactory {

	public abstract IPrinter getPrinter(String type);

	public abstract IShape getShape(String shape);
}
