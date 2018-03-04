package com.jmc.structural_patterns.proxy_pattern;

import java.util.Date;

/**
 * La clase Proxy es un proxy para un objeto SlowThing.
 * 
 * Como un objeto SlowThing tarda 5 segundos en crearse, usaremos un proxy en
 * SlowThing para que un objeto SlowThing solo se cree bajo demandao.Esto ocurre
 * cuando se ejecuta el método sayHello() del proxy.
 * 
 * Instancia un objeto SlowThing si aún no existe y luego llama a sayHello() en
 * el objeto SlowThing.
 * 
 */
public class Proxy {

	SlowThing slowThing;

	public Proxy() {
		System.out.println("Creating proxy at " + new Date());
	}

	public void sayHello() {
		if (slowThing == null) {
			System.out.println(">>> Proxy - sayHello()");
			slowThing = new SlowThing();
		}
		slowThing.sayHello();
	}

}
