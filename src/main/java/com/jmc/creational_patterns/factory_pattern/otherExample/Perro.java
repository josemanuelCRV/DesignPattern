package com.jmc.creational_patterns.factory_pattern.otherExample;

/**
 * La clase Dog es una subclase de Animal. Implementa makeSound() para devolver
 * el correspondiente sonido de este tipo de animal, "Woof".
 *
 */
public class Perro extends Animal {

	@Override
	public String makeSound() {
		return "Woof";
	}

}
