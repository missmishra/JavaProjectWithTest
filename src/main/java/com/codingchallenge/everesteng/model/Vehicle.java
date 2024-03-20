package com.codingchallenge.everesteng.model;
public class Vehicle {
    double capacity;
    double speed;

    public Vehicle(double capacity, double speed) {
        this.capacity = capacity;
        this.speed = speed;
    }

    public Double getSpeed(){
        return speed;
    }

    public void setCapacity(double capacity){
        this.capacity = capacity;
    }

    public Double getCapacity(){
        return capacity;
    }
}
