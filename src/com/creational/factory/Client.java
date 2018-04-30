package com.creational.factory;

public class Client {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("PC", "8GB", "1TB", "4GB");
		Server server = (Server)ComputerFactory.getComputer("Server", "8GB", "1TB", "4GB");
		
		System.out.println("Factory PC Config::"+pc);
		System.out.println("Factory Server Config::"+server);
	}
}
