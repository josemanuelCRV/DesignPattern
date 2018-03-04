package com.jmc.structural_patterns.facade_pattern.facadeExample;

/**
 * El método doAnotherThing() de Class2 dobla el cubo de un entero y lo
 * devuelve.
 *
 */
public class Class2 {

	public int doAnotherThing(Class1 class1, int x) {
		return 2 * class1.doSomethingComplicated(x);
	}
}
