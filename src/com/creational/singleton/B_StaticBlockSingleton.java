package com.creational.singleton;

/**
 * 
 * @author peddaram
 *
 *         Static block initialization implementation is similar to eager
 *         initialization, except that instance of class is created in the
 *         static block that provides option for exception handling.
 */
public class B_StaticBlockSingleton {

	private static B_StaticBlockSingleton instance;

	static {
		try {
			instance = new B_StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	private B_StaticBlockSingleton() { }

	public static B_StaticBlockSingleton getInstance() {
		return instance;
	}
}

/**
 * 
 * Both eager initialization and static block initialization creates the
 * instance even before it’s being used and that is not the best practice to
 * use. So in further sections, we will learn how to create Singleton class that
 * supports lazy initialization
 */
