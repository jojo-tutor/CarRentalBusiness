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
public class Rectangle {
    private int numOfSides;
    private double length;
    private double width;

    public Rectangle() {
        this.numOfSides = 4;
        this.length=0;
        this.width=0;
    }
    
    public Rectangle(double length, double width) {
        this.length=length;
        this.width=width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    
    
    public double calculateArea(){
        double result = 0.0f;
        return result = this.length * this.width;
    }
    
    @Override
    public String toString(){
        return "The Rectangle has " + this.length + " length, " + this.width + " width " + "and " + 
                this.calculateArea() + " area.";
    }
}