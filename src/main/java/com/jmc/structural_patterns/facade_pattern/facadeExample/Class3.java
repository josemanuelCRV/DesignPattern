package com.jmc.structural_patterns.facade_pattern.facadeExample;

/**
 * El doMoreStuff() de Class3 toma un objeto Class1, un objeto Class2 y un
 * entero y devuelve el doble de la sexta potencia del entero.
 *
 */
public class Class3 {

	public int doMoreStuff(Class1 class1, Class2 class2, int x) {
		return class1.doSomethingComplicated(x) * class2.doAnotherThing(class1, x);
	}
}
