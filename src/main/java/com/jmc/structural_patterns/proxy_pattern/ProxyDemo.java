package com.jmc.structural_patterns.proxy_pattern;

/**
 * 
 * Crea un objeto Proxy y luego crea un objeto FastThing y llama a sayHello() en
 * el objeto FastThing. Luego, llama a sayHello() en el objeto Proxy dos veces.
 * 
 * 
 * Al ejecutar ProxyDemo, podemos ver que la creación SlowThing es un proceso
 * que consume mucho tiempo. Sin embargo, esto no ralentizó la ejecución de
 * nuestra aplicación hasta que realmente se requirió el objeto SlowThing.
 * 
 * Podemos ver aquí que el patrón proxy evita la creación de objetos que
 * requieren mucho tiempo hasta que realmente se necesitan y, además, no se
 * volvió a crear 
 * 
 *
 */
public class ProxyDemo {

	public static void main(String[] args) {

		Proxy proxy = new Proxy();

		FastThing fastThing = new FastThing();
		fastThing.sayHello();

		proxy.sayHello();
		proxy.sayHello();
	}

}
