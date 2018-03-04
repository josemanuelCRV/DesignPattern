package com.jmc.creational_patterns.prototype_pattern.otrherExamples;

public class DemoPrototype {
	
	public static void main(String[] args) {
		
		Persona persona1 = new Persona("Jose");
		System.out.println("persona 1:" + persona1);
		
		// Creamos otra persona clonando la primera
		Persona persona2 = (Persona) persona1.doClone();
		System.out.println("persona 2: " + persona2);
		
		
		Perro perro1 = new Perro("wooouf");
		System.out.println("Perro 1 dice: " + perro1);
		
		// Creamos clone de perro1
		Perro perro2 = (Perro) perro1.doClone();
		System.out.println("Perro 2 'clonado' dice: " + perro2);
	}

}
