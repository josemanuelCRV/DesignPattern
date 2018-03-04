package com.jmc.structural_patterns.flyweight_pattern;

/**
 * 
 * La clase FlyweightMultiplier es similar a la clase FlyweightAdder, excepto
 * que realiza multiplicación en lugar de suma.
 *
 */
public class FlyweightMultiplier implements Flyweight {

	String operation;

	public FlyweightMultiplier() {
		operation = "multiplying";
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void doMath(int a, int b) {
		System.out.println(operation + " " + a + " and " + b + ": " + (a * b));

	}

}
