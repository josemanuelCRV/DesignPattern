package com.jmc.creational_patterns.singleton_pattern;

/**
 * A singleton is a class that is instantiated only once. This is typically
 * accomplished by creating a static field in the class representing the class.
 * A static method exists on the class to obtain the instance of the class and
 * is typically named something such as getInstance(). The creation of the
 * object referenced by the static field can be done either when the class is
 * initialized or the first time that getInstance() is called. The singleton
 * class typically has a private constructor to prevent the singleton class from
 * being instantiated via a constructor. Rather, the instance of the singleton
 * is obtained via the static getInstance() method.
 * 
 */
public class SingletonExample {

	/**
	 * It contains a private static SingletonExample field.
	 */
	private static SingletonExample singletonExample = null;

	/**
	 * It has a private constructor so that the class can't be instantiated by
	 * outside classes.
	 */
	private SingletonExample() {
		super();
	}

	/**
	 * It has a public static getInstance() method that returns the one and only
	 * SingletonExample instance.
	 * 
	 * @return If this instance doesn't already exist, the getInstance() method
	 *         creates it.
	 */
	public static SingletonExample getInstance() {
		if (singletonExample == null) {
			singletonExample = new SingletonExample();
		}
		return singletonExample;
	}

	/**
	 * The public sayHello() method that can be
	 * used to test the singleton.
	 */
	public void sayHello() {
		System.out.println("Hello");
	}

}
