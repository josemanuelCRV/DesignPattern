package com.jmc.creational_patterns.factory_pattern.otherExample;

/**
 * La clase de demostración demuestra el uso de nuestra fábrica.
 * 
 * Crea una fábrica de AnimalFactory para producir animales. La fábrica crea un
 * primer objeto Animal y luego un segundo objeto Animal. El primer objeto es un
 * perro y el segundo objeto Animal es un gato. Se muestra el resultado del
 * método makeSound() de cada objeto.
 *
 */
public class DemoAnimal {

	public static void main(String[] args) {
		callGetAnimalFactory();
		callGetAnimalSingletonFactory();
	}

	/**
	 * Simple Factory
	 */
	private static void callGetAnimalFactory() {
		// Crea una fábrica
		AnimalFactory animalFactory = new AnimalFactory();

		// Creamos un objeto animal llamando al método de la fabrica.
		// El método por parámetro recibe el tipo de animal que queremos.
		Animal animal1 = animalFactory.getAnimal("canino");
		System.out.println("Sonido animal1: " + animal1.makeSound());

		Animal animal2 = animalFactory.getAnimal("felino");
		System.out.println("Sonido animal2: " + animal2.makeSound());
	}

	/**
	 * Singleton Factory
	 */
	private static void callGetAnimalSingletonFactory() {

		/**
		 * No hay posibilidad de crear una nueva Fábrica con 'new
		 * AnimalFactorySingleton()' porque su constructor es privado. Solo
		 * podremos llamar al método público getAnimalFactoryInstance() que será
		 * la encargada de devolvernos una nueva fabrica si no existe aún
		 * ninguna.
		 */
		// Creando fabrica o recuperndo una si la hubiese.
		AnimalFactorySingleton animalFactorySingleton = AnimalFactorySingleton.getAnimalFactoryInstance();
		Animal animalSingle = animalFactorySingleton.getSound("felino");
		System.out.println("Sonido de animal creado con fábrica Singleton: " + animalSingle.makeSound());

		
		/**
		 * Intentamos crear otra nueva fábrica para generar otro animal, pero
		 * debe existir ya una de la creación anterior, dado que aún
		 * permanecemos dentro del método y no ha finalizado. Aparecerá el
		 * mensaje sout '>>> Creando nueva Fábrica' una sola vez.
		 */
		AnimalFactorySingleton animalFactorySingleton2 = AnimalFactorySingleton.getAnimalFactoryInstance();
		Animal animalSingle2 = animalFactorySingleton2.getSound("canino");
		System.out.println("Sonido de animal creado con fábrica Singleton: " + animalSingle2.makeSound());

	}

}
