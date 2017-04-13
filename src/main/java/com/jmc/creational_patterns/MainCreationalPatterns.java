package com.jmc.creational_patterns;

import com.jmc.creational_patterns.abstract_pattern.MainAbtractFactory;
import com.jmc.creational_patterns.builder_pattern.MainBuildedWindow;
import com.jmc.creational_patterns.builder_pattern.builder.WindowBuilder;
import com.jmc.creational_patterns.factory_pattern.MainFactoryPattern;
import com.jmc.creational_patterns.prototype_pattern.MainPrototype;
import com.jmc.creational_patterns.singleton_pattern.MainSingletonWindow;

/**
 * Using the Factory Class
 *
 */
public class MainCreationalPatterns {
	public static void main(String[] args) {

		// FactoryPattern
 		MainFactoryPattern.startFactoryPattern();

		// AbstractPattern
		MainAbtractFactory.startAbstractPattern();

		// SingletonPattern - Get the only object available
		MainSingletonWindow object = MainSingletonWindow.getInstance();
		object.showMessage();

		// BuilderPattern - Get the object builded with simple objects
		MainBuildedWindow buildedWindow = WindowBuilder.createWindow();
		buildedWindow.getMenu().print();
 		
		// PrototypePattern
		MainPrototype.startPrototypePattern();
		
		
	}
}
