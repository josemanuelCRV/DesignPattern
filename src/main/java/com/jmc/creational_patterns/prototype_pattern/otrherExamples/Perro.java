package com.jmc.creational_patterns.prototype_pattern.otrherExamples;

/**
 * La clase Perro también implementa el método doClone().
 * 
 * Este método crea un nuevo objeto Perro y clona el campo de sonido.
 * 
 * El objeto Perro clonado se devuelve.
 *
 */
public class Perro implements Prototype {

	private String sonido;

	public Perro(String sound) {
		this.sonido = sound;
	}

	public Prototype doClone() {
		return new Perro(sonido);
	}

	public String toString() {
		return "This animal dice: " + sonido;
	}

}
