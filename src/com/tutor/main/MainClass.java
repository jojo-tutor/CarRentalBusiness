/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutor.main;

import com.tutor.shapes.Circle;
import com.tutor.shapes.Rectangle;
import java.util.Scanner;

/**
 *
 * @author cl7admin
 */
public class MainClass {
    
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("*Available Shapes\n\tCicle[C]\n\tRectangle[R]\nYour choice: ");
        String choice = scan.next();
        switch(choice){
            case "C":
                cicleShape();
                break;
            case "R":
                rectangleShape();
                break;
            case "L":
                System.out.println("Food");
                break;
            default:
                System.out.println("Wrong choice!");
                break;
        }
    }
    
    private static void cicleShape(){
        System.out.print("Input radius: ");
        double radius = scan.nextDouble();

        Circle c = new Circle(radius);
        System.out.println(c);
    }
    
    private static void rectangleShape(){
        System.out.print("Input length: ");
        double length = scan.nextDouble();
        
        System.out.print("Input width: ");
        double width = scan.nextDouble();

        Rectangle r = new Rectangle(length,width);
        System.out.println(r);
        
        System.out.println("sdfsdf");
        System.out.println("sdfsdf");
        System.out.println("sdfsdf");
        System.out.println("sdfsdf");
        System.out.println("sdfsdf");
        System.out.println("sdfsdf");
    }
}
