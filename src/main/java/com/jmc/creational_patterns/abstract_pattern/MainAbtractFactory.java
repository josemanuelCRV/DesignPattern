package com.jmc.creational_patterns.abstract_pattern;

import com.jmc.creational_patterns.abstract_pattern.factory.AbstractFactory;
import com.jmc.creational_patterns.abstract_pattern.factory.FactoryProducer;
import com.jmc.creational_patterns.abstract_pattern.interfaces.IPrinter;
import com.jmc.creational_patterns.abstract_pattern.interfaces.IShape;

public class MainAbtractFactory {

	public static void startAbstractPattern() {

		// get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		
		// get an object of Shape Circle
		IShape shape1 = shapeFactory.getShape("CIRCLE");
		// call draw method of Shape Circle
		shape1.draw();

		
		
		// get an object of Shape Rectangle
		IShape shape2 = shapeFactory.getShape("RECTANGLE");
		// call draw method of Shape Rectangle
		shape2.draw();

		
		
		// get an object of Shape Square
		IShape shape3 = shapeFactory.getShape("SQUARE");
		// call draw method of Shape Square
		shape3.draw();

		
		// get printer factory
		AbstractFactory printerFactory = FactoryProducer.getFactory("printer");

		IPrinter printer1 = printerFactory.getPrinter("Paper");
		printer1.print();
		IPrinter printer2 = printerFactory.getPrinter("Web");
		printer2.print();
		IPrinter printer3 = printerFactory.getPrinter("Screen");
		printer3.print();
	}

}
