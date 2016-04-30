/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutor.shapes;

/**
 *
 * @author cl7admin
 */
public class Circle {
    private int numOfSides;
    private double radius;

    public Circle() {
        this.numOfSides = 0;
        this.radius = 0.0f;
    }
    
    public Circle(double r) {
        this.numOfSides = 0;
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
}