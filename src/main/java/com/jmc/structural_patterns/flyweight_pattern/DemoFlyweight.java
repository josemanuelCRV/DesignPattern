package com.jmc.structural_patterns.flyweight_pattern;

/**
 * La clase FlyweightDemo demuestra nuestro patrón Flyweight.
 * 
 * Obtiene un objeto FlyweightFactory a través de
 * FlyweightFactory.getInstance(). Después de esto, en un bucle, obtiene un
 * FlyweightAdder de FlyweightFactory y llama a su operación doMath() con el
 * índice de bucle actual como los dos valores de parámetro. Luego, hace lo
 * mismo con un FlyweightMultiplier.
 * 
 *
 */
public class DemoFlyweight {

	public static void main(String[] args) {

		FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();

		for (int i = 0; i < 5; i++) {
			Flyweight flyweightAdder = flyweightFactory.getFlyweight("add");
			flyweightAdder.doMath(i, i);

			Flyweight flyweightMultiplier = flyweightFactory.getFlyweight("multiply");
			flyweightMultiplier.doMath(i, i);
		}

	}

}
