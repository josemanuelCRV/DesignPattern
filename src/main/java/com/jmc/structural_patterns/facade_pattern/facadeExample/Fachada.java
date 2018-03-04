package com.jmc.structural_patterns.facade_pattern.facadeExample;

/**
 * Para un cliente que no esté familiarizado con {@link Class1}, {@link Class2}
 * y {@link Class3}, sería muy difícil averiguar cómo interactuar con estas
 * clases. Las clases interactúan y realizan tareas de forma poco clara.
 * 
 * Como resultado, debemos ser capaces de simplificar la interacción con este
 * sistema de clases para que los clientes puedan interactuar con estas clases
 * de una manera simple y estandarizada.
 * 
 * Hacemos esto con la clase de {@link Fachada}.
 * 
 * La clase Facade tiene tres métodos: cubeX(), cubeXTimes2() y
 * xToSixthPowerTimes2().
 * 
 * Los nombres de estos métodos indican claramente lo que hacen, y estos métodos
 * ocultan las interacciones de Class1, Class2 y Class3 del código del cliente.
 *
 */
public class Fachada {

	public int cubeX(int x) {
		Class1 class1 = new Class1();
		return class1.doSomethingComplicated(x);
	}

	public int cubeXTimes2(int x) {
		Class1 class1 = new Class1();
		Class2 class2 = new Class2();
		return class2.doAnotherThing(class1, x);
	}

	public int xToSixthPowerTimes2(int x) {
		Class1 class1 = new Class1();
		Class2 class2 = new Class2();
		Class3 class3 = new Class3();
		return class3.doMoreStuff(class1, class2, x);
	}

}
