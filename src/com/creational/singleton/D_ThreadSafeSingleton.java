/**
 * 
 */
package com.creational.singleton;

/**
 * @author peddaram
 *
 *         The easier way to create a thread-safe singleton class is to make the
 *         global access method synchronized, so that only one thread can
 *         execute this method at a time. General implementation of this
 *         approach is like the below class.
 */
public class D_ThreadSafeSingleton {

	private static D_ThreadSafeSingleton instance;

	private D_ThreadSafeSingleton() {
	}

	public static synchronized D_ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new D_ThreadSafeSingleton();
		}
		return instance;
	}

	/**
	 * Above implementation works fine and provides thread-safety but it reduces the
	 * performance because of cost associated with the synchronized method, although
	 * we need it only for the first few threads who might create the separate
	 * instances (Read: Java Synchronization). To avoid this extra overhead every
	 * time, double checked locking principle is used. In this approach, the
	 * synchronized block is used inside if condition with an additional check to
	 * ensure that only one instance of singleton class is created
	 */
	
	//Below code snippet provides the double checked locking implementation.
	
	public static D_ThreadSafeSingleton getInstanceUsingDoubleLocking() {
		if(instance == null) {
			synchronized (D_ThreadSafeSingleton.class) {
				if(instance == null) {
					instance = new D_ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}
}
