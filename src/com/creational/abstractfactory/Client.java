package com.creational.abstractfactory;

public class Client {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer(new PCFactory("8GB", "1TB", "4GB"));
		Server server = (Server)ComputerFactory.getComputer(new ServerFactory("8GB", "1TB", "4GB"));
		
		System.out.println("Factory PC Config::"+pc);
		System.out.println("Factory Server Config::"+server);
	}
}
