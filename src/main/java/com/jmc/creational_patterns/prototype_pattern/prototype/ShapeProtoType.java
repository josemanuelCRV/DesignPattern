package com.jmc.creational_patterns.prototype_pattern.prototype;

import java.util.Hashtable;

import com.jmc.creational_patterns.prototype_pattern.objects.Circle;
import com.jmc.creational_patterns.prototype_pattern.objects.Rectangle;
import com.jmc.creational_patterns.prototype_pattern.objects.Shape;
import com.jmc.creational_patterns.prototype_pattern.objects.Square;

/**
 * After that it creates a ShapeProtoType class to return the prototype of
 * shapes.
 *
 */
public class ShapeProtoType {

	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

	public static Shape getShape(String shapeId) {
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape) cachedShape.clone();
	}
	
	public static void loadCache() {
	      Circle circle = new Circle();
	      circle.setId("1");
	      shapeMap.put(circle.getId(),circle);

	      Square square = new Square();
	      square.setId("2");
	      shapeMap.put(square.getId(),square);

	      Rectangle rectangle = new Rectangle();
	      rectangle.setId("3");
	      shapeMap.put(rectangle.getId(),rectangle);
	   }

}
