package com.jmc.creational_patterns.abstract_pattern.factory;

import com.jmc.creational_patterns.abstract_pattern.interfaces.IPrinter;
import com.jmc.creational_patterns.abstract_pattern.interfaces.IShape;
import com.jmc.creational_patterns.abstract_pattern.objects.Circle;
import com.jmc.creational_patterns.abstract_pattern.objects.PaperPrinter;
import com.jmc.creational_patterns.abstract_pattern.objects.Rectangle;
import com.jmc.creational_patterns.abstract_pattern.objects.ScreenPrinter;
import com.jmc.creational_patterns.abstract_pattern.objects.Square;
import com.jmc.creational_patterns.abstract_pattern.objects.WebPrinter;

/**
 * 
 * Finally we create Factory classes extending AbstractFactory to generate
 * object of concrete class based on given information.
 *
 */
public class ShapeFactory extends AbstractFactory {

	@Override
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

	@Override
	public IPrinter getPrinter(String type) {
		// TODO Auto-generated method stub
		return null;
	}

}

class PrinterFactory extends AbstractFactory {

	@Override
	public IShape getShape(String shapeType) {
		return null;
	}

	@Override
	public IPrinter getPrinter(String type) {
		if (type == null) {
			return null;
		}
		if (type.equalsIgnoreCase("paper")) {
			return new PaperPrinter();
		} else if (type.equalsIgnoreCase("web")) {
			return new WebPrinter();
		} else if (type.equalsIgnoreCase("Screen")) {
			return new ScreenPrinter();
		}
		return null;
	}
}