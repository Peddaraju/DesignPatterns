package com.creational.factory1;

public class VechicleFactory {

    public static Vechicle createVechicle(String vechicleName) {
        if(vechicleName == null) {
            return null;
        }
        switch (vechicleName.toLowerCase()) {
            case "car":
                return new Car();
            case "bike":
                return new Bike();
            default:
                throw new IllegalArgumentException("unknow vechicle type");
        }
    }
}
