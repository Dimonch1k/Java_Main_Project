package org.itstep.mystat;

import java.util.Objects;

// public class Car extends Class {} // extends for Classes
public class Car implements Vechicle{ // implements for Interfaces
    private int speed;
    private String name;

    public Car (int speed, String name)
    {
        this.speed = speed;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return speed == car.speed && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, name);
    }


    public void setName(String name) { //   Set Name
        this.name = name;
    }

    public String getName() {   // Set Name
        return name;
    }

    public void setSpeed(int speed) {   // set Speed
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void drive() {
        System.out.println("Driving");
        System.out.println("Speed: " + speed);
        System.out.println("Name: " + name);
    }
}
