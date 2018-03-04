package com.jmc.creational_patterns.factory_pattern.otherExample;

/**
 * La clase Cat es una subclase de Animal. Implementa makeSound () para devolver
 * "Meow".
 *
 */
public class Gato extends Animal {

	@Override
	public String makeSound() {
		return "Meow";
	}

}
