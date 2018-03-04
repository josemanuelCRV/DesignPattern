package com.jmc.structural_patterns.facade_pattern.facadeExample;

/**
 * 
 * Este ejemplo demuestra cómo se puede usar el patrón de fachada para
 * simplificar las interacciones con un sistema de clases al proporcionar un
 * único punto de interacción con el subsistema y ocultar los detalles complejos
 * de las interacciones del subsistema desde el código del cliente.
 * 
 * Esto se logra con una clase de Fachada.
 * 
 * @see Fachada
 * 
 *
 */
public class DemoFachada {

	public static void main(String[] args) {

		Fachada fachada = new Fachada();

		int x = 3;

		System.out.println("(3^3) ==> El cubo del entero " + x + " = " + fachada.cubeX(x));
		System.out.println("(3^3 x2) ==> El doble del cubo del entero " + x + " = " + fachada.cubeXTimes2(x));
		System.out.println("(3^6 x2) ==> El doble de la sexta potencia del entero " + x + " = " + fachada.xToSixthPowerTimes2(x));

	}

}
