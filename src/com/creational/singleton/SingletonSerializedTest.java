package com.creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * The problem with above serialized singleton class is that whenever we
 * deserialize it, it will create a new instance of the class. Let’s see it with
 * a simple program.
 * 
 * @author peddaram
 *
 */
public class SingletonSerializedTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		H_SerializedSingleton instanceOne = H_SerializedSingleton.getInstance();

		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
		out.writeObject(instanceOne);
		out.close();

		// deserailize from file to object
		ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
		H_SerializedSingleton instanceTwo = (H_SerializedSingleton) in.readObject();
		in.close();

		System.out.println("instanceOne	hashCode=" + instanceOne.hashCode());
		System.out.println("instanceTwo	hashCode=" + instanceTwo.hashCode());
	}

	/**
	 * So it destroys the singleton pattern, to overcome this scenario all we need
	 * to do it provide the implementation of readResolve() method. 
	 * 
	 * protected Object readResolve() { 
	 * 	return getInstance(); 
	 * } 
	 * 
	 * After this you will notice that
	 * hashCode of both the instances are same in test program.
	 */
	
}
