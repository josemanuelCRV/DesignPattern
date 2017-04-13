package com.jmc.creational_patterns.factory_pattern.factory;

import com.jmc.creational_patterns.factory_pattern.interfaces.IShape;
import com.jmc.creational_patterns.factory_pattern.objects.Circle;
import com.jmc.creational_patterns.factory_pattern.objects.Rectangle;
import com.jmc.creational_patterns.factory_pattern.objects.Square;

/**
 * How to create a Factory class for Shape objects.
 * 
 * The ShapeFactory class creates Shape object based on the String value passed
 * in to the getShape() method. If the String value is CIRCLE, it will create a
 * Circle object.
 *
 * The objects created by the factory pattern would be shape objects, such as
 * Circle, Rectangle.
 * 
 * 1.- First we design an interface to represent Shape.
 * 
 * 2.- Create classes for objects(Circle,Rectangle..) implementing the interface
 * 
 * 3.- Create a Factory class for Shape objects.
 * 
 * 4.- Create MainShapePattern class with a startFactoryPattern() method to use the Factory class to get object of concrete
 *     class by passing an information such as type.
 */
public class ShapeFactory {

	// use getShape method to get object of type shape
	public IShape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}
}
