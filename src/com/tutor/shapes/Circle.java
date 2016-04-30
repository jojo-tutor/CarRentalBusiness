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
    
    /**
     * Get Radius
     * @return This method gets the radius of the circle.
     */
    public double getRadius() {
        return radius;
    }
    
    /**
     * Set Radius
     * @param This method sets the radius of a circle.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    /**
     * Area
     * @return This method calculates the area.
     */
    public double calculateArea(){
        double result = 0.0f;
        return result = Math.PI * (this.radius * this.radius);
    }
    
    @Override
    public String toString(){
        return "The Circle has " + this.radius + " radius and " + 
                this.calculateArea() + " area.";
    }
}