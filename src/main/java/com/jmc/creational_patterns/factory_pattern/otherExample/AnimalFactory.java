package com.jmc.creational_patterns.factory_pattern.otherExample;

/**
 * Ahora, implementemos nuestra fábrica. Llamaremos getAnimal al método de
 * creación de objetos de nuestra fábrica. Este método toma una cadena como
 * parámetro. Si el String es "canino", devuelve un objeto Perro. De lo contrario,
 * devuelve un objeto Gato.
 */
public class AnimalFactory {

	public Animal getAnimal(String type) {
		if ("canino".equals(type)) {
			return new Perro();
		} else {
			return new Gato();
		}
	}
}
