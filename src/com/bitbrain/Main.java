package com.bitbrain;

public class Main {
    public static void main(String[] args) {
        SUV toyota = new SUV("LandCrusier",false);
        toyota.move(40,0);

        System.out.println("current speed " + toyota.getCurrentSpeed());

        toyota.accelerate(3,5);

        System.out.println("current speed " + toyota.getCurrentSpeed());

        toyota.accelerate(-20,5);

        System.out.println("current speed " + toyota.getCurrentSpeed());

    }
}
