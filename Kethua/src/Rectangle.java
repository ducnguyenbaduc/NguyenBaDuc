/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nguyen Ba Duc
 */
public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;
    
    public Rectangle(){}
    
    public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }
    
    public Rectangle(double width,double length,String color,boolean filled){
        this.width = width;
        this.length = length;
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea(){
        double a;
        a = width * length;
        return a;
    }
    
    public double getPerimeter(){
        double p;
        p = (width + length) * 2;
        return p;
    }
    
    @Override
    public String toString(){
        String s = "Hinh chu nhat:\n" + "Chu vi = " + this.getPerimeter() + "\n" + "Dien tich = " + this.getArea();
        return s;
    }
    
}
