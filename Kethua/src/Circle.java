/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nguyen Ba Duc
 */
public class Circle extends Shape{
    private double radius = 1.0;
    private final double PI = 3.14;
    
    public Circle(){}
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public Circle(double radius,String color,boolean filled){
        this.radius = radius;
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        double a;
        a = (radius*radius)*PI;
        return a;
    }
    
    public double getPerimeter(){
        double p;
        p = 2 * PI * radius;
        return p;
    }

    @Override
    public String toString(){
        String s = "Hinh tron mau " + this.getColor() + ":\n" + "Chu vi = " + this.getPerimeter() + "\n" + "Dien tich = " + this.getArea();
        return s;
    }
}
