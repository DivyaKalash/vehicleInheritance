package com.TheK;

public class Car extends vehicle {

    private int wheels;
    private int doors;
    private int gear;
    private boolean isManual;
    private int currentGear ;

    public Car(String name, String size, int wheels, int doors, int gear, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gear = gear;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear){
        this.currentGear = currentGear;
        System.out.println("Car Gear changed to "+this.currentGear);
    }

    public void changeVelocity(int speed , int direction){
        System.out.println("Speed ="+speed + " , Direction = " + direction);
        move(speed,direction);
    }
}
