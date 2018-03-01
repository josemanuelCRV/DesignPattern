package com.jmc.creational_patterns.singleton_pattern;

/**
 * 
 * The Demo class obtains a SingletonExample singleton class via the call to the
 * static SingletonExample.getInstance(). We call the sayHello() method on the
 * singleton class. Executing the Demo class outputs "Hello" to standard output.
 * 
 * @see SingletonExample
 *
 */
public class DemoSingleton {

	public static void main(String[] args) {

		SingletonExample singletonExample = SingletonExample.getInstance();
		singletonExample.sayHello();
	}

	// Singleton classes are a useful way of concentrating access to particular
	// resources into a single class instance.
}
