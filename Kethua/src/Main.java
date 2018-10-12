/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nguyen Ba Duc
 */
public class Main {
    public static void main(String[] args){
        Square s = new Square(1.0);
        System.out.println(s.getArea() + " " + s.getPerimeter());
        Rectangle r = new Rectangle(3.0,4.0);
        System.out.println(r.toString());
        Circle c = new Circle(1.0);
        System.out.println(c.toString());
        
        
    }
}
