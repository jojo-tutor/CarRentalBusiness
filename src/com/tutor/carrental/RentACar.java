/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutor.carrental;

import java.util.Scanner;

/**
 *
 * @author cl7admin
 */
public class RentACar {
    private Driver driver;
    private Car car;
    private double price;
    private double totalEarnings;

    public RentACar() {
        this.driver = null;
        this.car = null;
        this.price = 0.0f;
        this.totalEarnings = 0.0f;
    }

    public RentACar(Driver driver, Car car, double price) {
        this.driver = driver;
        this.car = car;
        this.price = price;
        this.totalEarnings = 0.0f;
    }

    public Driver getDriver() {
        return driver;
    }

    public Car getCar() {
        return car;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalEarnings() {
        return totalEarnings;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    
    public void passengerDelivered(){
        this.totalEarnings += this.price;
    }

    @Override
    public String toString(){
        return this.driver+"\n"+this.car+"\nTotal Earnings: "+this.totalEarnings;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        RentACar ra = new RentACar(new Driver("Jojo","01VG33"), new Car("2016 Model",3), 600);
        ra.passengerDelivered();
        System.out.println(ra);
    }
}
