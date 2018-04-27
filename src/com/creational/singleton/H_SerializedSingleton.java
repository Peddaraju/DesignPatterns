package com.creational.singleton;

import java.io.Serializable;

/**
 * Sometimes in distributed systems, we need to implement Serializable interface
 * in Singleton class so that we can store its state in file system and ©
 * JOURNALDEV.COM PAGE 13 OF 132 retrieve it at later point of time. Here is a
 * small singleton class that implements Serializable interface also.
 * 
 * @author peddaram
 *
 */
public class H_SerializedSingleton implements Serializable {

	private static final long serialVersionUID = 3811538973284171652L;

	private H_SerializedSingleton() {
	}

	private static class SingletonHelper {
		private static final H_SerializedSingleton INSTANCE = new H_SerializedSingleton();
	}

	public static H_SerializedSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}

	/*protected Object readResolve() {
		return getInstance();
	}*/

}
