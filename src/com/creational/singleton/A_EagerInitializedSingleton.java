package com.creational.singleton;

/**
 * 
 * @author peddaram
 *
 *         In eager initialization, the instance of Singleton Class is created
 *         at the time of class loading, this is the easiest method to create a
 *         singleton class but it has a drawback that instance is created even
 *         though client application might not be using it.
 */
public class A_EagerInitializedSingleton {

	private static final A_EagerInitializedSingleton instance = new A_EagerInitializedSingleton();

	// private constructor to avoid client applications to use constructor
	private A_EagerInitializedSingleton() { }

	public static A_EagerInitializedSingleton getInstance() {
		return instance;
	}
}
/**
 * 
 * If your singleton class is not using a lot of resources, this is the approach
 * to use. But in most of the scenarios, Singleton classes are created for
 * resources such as File System, Database connections etc and we should avoid
 * the instantiation until unless client calls the getInstance method. Also this
 * method doesn�t provide any options for exception handling.
 */
