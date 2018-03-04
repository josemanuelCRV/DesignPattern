package com.jmc.structural_patterns.composite_pattern;

/**
 * La clase DemoComposite demuestra el patrón compuesto.
 * 
 * Crea 5 objetos de hoja.
 * 
 * Agrega dos de estos objetos hoja a un compuesto.
 * 
 * Agrega otros dos objetos hoja a otro objeto compuesto.
 * 
 * El último objeto hoja5 lo añadiremos a un tercer objeto compuesto, en el que
 * además se añadirán los otros 2 objetos compuestos creados anteriormente.
 * 
 * 
 * 
 */
public class DemoComposite {

	public static void main(String[] args) {

		Hoja hoja1 = new Hoja("Jose");
		Hoja hoja2 = new Hoja("Juan");
		Hoja hoja3 = new Hoja("Pedro");
		Hoja hoja4 = new Hoja("Mateo");
		Hoja hoja5 = new Hoja("Lucas");

		Composite composite1 = new Composite();
		composite1.add(hoja1);
		composite1.add(hoja2);

		Composite composite2 = new Composite();
		composite2.add(hoja3);
		composite2.add(hoja4);

		Composite composite3 = new Composite();
		composite3.add(composite1);
		composite3.add(composite2);
		composite3.add(hoja5);

		
		System.out.println("Calling 'sayHello' on hoja1");
		hoja1.sayHello();
		
		System.out.println("\nCalling 'sayHello' on composite1");
		composite1.sayHello();
		
		System.out.println("\nCalling 'sayHello' on composite2");
		composite2.sayHello();
		
		System.out.println("\nCalling 'sayGoodbye' on composite3");
		composite3.sayGoodbye();
		
	}

}
