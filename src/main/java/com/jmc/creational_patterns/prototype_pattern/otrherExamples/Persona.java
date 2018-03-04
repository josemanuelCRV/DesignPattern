package com.jmc.creational_patterns.prototype_pattern.otrherExamples;

/**
 * La clase Persona implementa el método doClone().
 * 
 * Este método crea un nuevo objeto Persona y clona el campo de nombre.
 * 
 * Devuelve el objeto Person recién clonado.
 *
 */
public class Persona implements Prototype {

	String name;

	public Persona(String nombre) {
		this.name = nombre;
	}

	public Prototype doClone() {
		return new Persona(name);
	}

	public String toString() {
		return "This person is named " + name;
	}

}
