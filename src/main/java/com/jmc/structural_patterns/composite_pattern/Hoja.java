package com.jmc.structural_patterns.composite_pattern;

/**
 * The Leaf class has a name field and implements the sayHello() and
 * sayGoodbye() methods of the Component interface by outputting messages to
 * standard output.
 *
 */
public class Hoja implements Component {

	private String nombre;

	public Hoja(String name) {
		this.nombre = name;
	}

	public void sayHello() {
		System.out.println("La Hoja " + nombre + " dice hello!");

	}

	public void sayGoodbye() {
		System.out.println("La Hoja " + nombre + " dice adiossss!");

	}

}
