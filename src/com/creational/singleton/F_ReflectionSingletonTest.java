package com.creational.singleton;

import java.lang.reflect.Constructor;

/**
 * 
 * @author peddaram
 * 
 *         Reflection can be used to destroy all the above singleton
 *         implementation approaches. Let’s see this with an example class.
 */
public class F_ReflectionSingletonTest {

	public static void main(String[] args) {
		A_EagerInitializedSingleton instanceOne = A_EagerInitializedSingleton.getInstance();

		A_EagerInitializedSingleton instanceTwo = null;

		try {
			Constructor[] constructors = A_EagerInitializedSingleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				//// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instanceTwo = (A_EagerInitializedSingleton) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());

		/**
		 * When you run the above test class, you will notice that hashCode of both the
		 * instances are not same that destroys the singleton pattern. Reflection is
		 * very powerful and used in a lot of frameworks like Spring and Hibernate
		 */
	}
}
