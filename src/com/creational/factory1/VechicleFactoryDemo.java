package com.creational.factory1;

public class VechicleFactoryDemo {

    public static void main(String[] args) {
        Vechicle factory = VechicleFactory.createVechicle("truck");
        factory.manufacture();
    }
}
