package com.jmc.creational_patterns.factory_pattern.otherExample;

/**
 * Una fábrica también se puede usar junto con el patrón singleton. Es común que
 * un singleton devuelva una instancia de fábrica.
 * 
 *
 */
public class AnimalFactorySingleton {

	private static AnimalFactorySingleton animalFactorySingleton = null;

	// Constructor privado para evitar que se puedan generar objetos
	// AnimalFactorySingleton desde fuera de esta clase.
	private AnimalFactorySingleton() {
		super();
	}

	// Al llamar a este método, si no existe una instancia ya de
	// animalFactorySingleton se creará una. De lo contrario devuelve la
	// instancia existente.
	public static AnimalFactorySingleton getAnimalFactoryInstance() {
		if (animalFactorySingleton == null) {
			System.out.println(">>> Creando nueva Fábrica");
			animalFactorySingleton = new AnimalFactorySingleton();
		}
		return animalFactorySingleton;
	}

	/**
	 * 
	 * @param type
	 * @return Conditional Perro|Gato depend on parameter recieved.
	 */
	public Animal getSound(String type) {
		if ("canino".equals(type)) {
			return new Perro();
		} else {
			return new Gato();
		}

	}

}
