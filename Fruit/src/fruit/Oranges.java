/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruit;

/**
 *
 * @author Nguyen Ba Duc
 */
public class Oranges extends Fruit{
    private double cost;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    
    public Oranges(){}        
    public Oranges(String name, String source,String color,String savour,double cost){
        super.setName(name);
        super.setSource(source);
        super.setColor(color);
        super.setSavour(savour);
    }
    
    @Override
    public String toString(){
        String s = super.toString() + "\n" + "Gia: " + this.getCost();
        return s;
    }
}
