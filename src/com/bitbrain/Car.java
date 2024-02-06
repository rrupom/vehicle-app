package com.bitbrain;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, int wheels, String type, int doors, int gears, boolean isManual) {
        super(name);
        this.wheels = wheels;
        this.type = type;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int newGear) {
        this.currentGear = newGear;
//        System.out.println("chnagedGear method is called: changed to " + this.currentGear + " gear");
    }

    public void changeSpeed(int newSpeed,int direction) {
        move(newSpeed,direction);
//        System.out.println("change speed method called: current speed -> " + getCurrentSpeed() + " direction -> "+ getCurrentDirection());
    }
}
