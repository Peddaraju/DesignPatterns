package com.creational.singleton;

/**
 * 
 * @author peddaram
 *
 *         Lazy initialization method to implement Singleton pattern creates the
 *         instance in the global access method. Here is the sample code for
 *         creating Singleton class with this
 */
public class C_LazyInitializedSingleton {

	private static C_LazyInitializedSingleton instance;
	
	private C_LazyInitializedSingleton() { }
	
	public static C_LazyInitializedSingleton getInstance() {
		if(instance == null) {
			instance = new C_LazyInitializedSingleton();
		}
		return instance;
	}
}

/**
 * The above implementation works fine in case of single threaded environment
 * but when it comes to multithreaded systems, it can cause issues if multiple
 * threads are inside the if loop at the same time. It will destroy the
 * singleton pattern and both threads will get the different instances of
 * singleton class. In next section, we will see different ways to create a
 * threadsafe singleton class.
 */