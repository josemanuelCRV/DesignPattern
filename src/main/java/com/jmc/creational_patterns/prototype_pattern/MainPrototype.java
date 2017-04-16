package com.jmc.creational_patterns.prototype_pattern;

import com.jmc.creational_patterns.prototype_pattern.models.Shape;
import com.jmc.creational_patterns.prototype_pattern.prototype.ShapeProtoType;

public class MainPrototype {

	public static void startPrototypePattern() {

		ShapeProtoType.loadCache();

		Shape clonedShape = (Shape) ShapeProtoType.getShape("1");
		System.out.println("Shape : " + clonedShape.getType());

		Shape clonedShape2 = (Shape) ShapeProtoType.getShape("2");
		System.out.println("Shape : " + clonedShape2.getType());

		Shape clonedShape3 = (Shape) ShapeProtoType.getShape("3");
		System.out.println("Shape : " + clonedShape3.getType());

	}

}
