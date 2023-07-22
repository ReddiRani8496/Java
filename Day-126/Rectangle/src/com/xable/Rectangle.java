package com.xable;

public class Rectangle {

    double length;
    double breadth;

    public Rectangle(double length, double breadth) {

        this.length = length;
        this.breadth = breadth;

    }

    public void area() {
        System.out.println("Area of rectangle: "+ (length * breadth));
    }

}
