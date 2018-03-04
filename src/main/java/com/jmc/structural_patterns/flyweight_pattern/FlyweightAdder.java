package com.jmc.structural_patterns.flyweight_pattern;

/**
 * 
 * La clase FlyweightAdder es una clase concreta de Flyweight.
 * 
 * Contiene un campo de "operación" que se utiliza para almacenar el nombre de
 * una operación que es común para los Flyweight del sumador.
 * 
 * Observe la llamada a Thread.sleep (3000). Esto simula un proceso costoso de
 * construcción en términos de tiempo. Cada objeto FlyweightAdder que se crea
 * tarda 3 segundos en crearse, por lo que definitivamente queremos minimizar la
 * cantidad de objetos flyweight que se crean.
 * 
 * El método doMath() está implementado. Muestra el campo común de "operación" y
 * muestra la adición de 'a' y 'b', que son valores de estado externos que son
 * pasados ​​y utilizados por el FlyweightAdder cuando se ejecuta doMath().
 * 
 *
 */
public class FlyweightAdder implements Flyweight {

	String operation;

	public FlyweightAdder() {
		operation = "adding";
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void doMath(int a, int b) {
		System.out.println(operation + " " + a + " and " + b + ": " + (a + b));
	}

}
