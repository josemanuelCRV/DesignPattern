package com.jmc.structural_patterns.flyweight_pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * La clase FlyweightFactory es nuestra fábrica de flyweight.
 * 
 * Utiliza el patrón singleton para que solo tengamos una instancia de la
 * fábrica, que obtenemos a través de su método estático getInstance().
 * 
 * 
 * FlyweightFactory crea un conjunto de hashmap de Flyweight. Si se realiza una
 * solicitud desde un objeto flyweight y ese objeto no existe, se crea y se
 * coloca en el flyweightPool.
 * 
 * El flyweightPool de FlyweightFactory almacena todas las instancias de los
 * diferentes tipos de Flyweight (es decir, objeto FlyweightAdder, objeto
 * FlyweightMultiplier, etc.). Por lo tanto, solo se crea una instancia de cada
 * tipo, y esto ocurre bajo demanda o pedido.
 * 
 */
public class FlyweightFactory {

	// Singleton instance
	private static FlyweightFactory flyweightFactory;

	//
	private Map<String, Flyweight> flyweightPool;

	private FlyweightFactory() {
		flyweightPool = new HashMap<String, Flyweight>();
	}

	public static FlyweightFactory getInstance() {
		if (flyweightFactory == null) {
			System.out.println("Singleton >>> Creando flyweightPool");
			flyweightFactory = new FlyweightFactory();
		}
		return flyweightFactory;
	}

	public Flyweight getFlyweight(String key) {
		if (flyweightPool.containsKey(key)) {
			return flyweightPool.get(key);
		} else {
			Flyweight flyweight;
			if ("add".equals(key)) {
				flyweight = new FlyweightAdder();
			} else {
				flyweight = new FlyweightMultiplier();
			}
			flyweightPool.put(key, flyweight);
			return flyweight;
		}
	}

}
