package com.gamecodeschool.oop;

public class Taxi extends Car {

    private  int MaxPassengers;
    public Taxi(String color, String bodyType, int doors, int speed) {
        super(color, bodyType, doors, speed);
    }

    public Taxi(String color, String bodyType, int doors, int speed, int MaxPassengers) {
        super(color, bodyType, doors, speed);
        MaxPassengers = MaxPassengers;
    }
}
