/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutor.carrental;

/**
 *
 * @author cl7admin
 */
public class Car {
    private String model;
    private int numOfYrsOwned;

    public Car() {
        this.model = null;
        numOfYrsOwned = 0;
    }

    public Car(String model, int numOfYrsOwned) {
        this.model = model;
        this.numOfYrsOwned = numOfYrsOwned;
    }

    public String getModel() {
        return model;
    }

    public int getNumOfYrsOwned() {
        return numOfYrsOwned;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public int addCarBirthday(){
        return this.numOfYrsOwned+1;
    }
    
    @Override
    public String toString(){
        return "Car Info -> Model: "+this.model+" No. of years owned: "+addCarBirthday();
    }
    
}
