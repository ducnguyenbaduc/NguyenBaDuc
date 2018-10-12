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
public class Fruit {
    
    private String name; // Ten loai
    private String source; // Nguon goc
    private String color;  // Mau sac
    private String savour; // Huong vi

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSavour() {
        return savour;
    }

    public void setSavour(String savour) {
        this.savour = savour;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString(){
        String s = "Ten: " + this.name + "\n" + "Nguon goc: " + this.source + "Mau sac: " +  this.color + "\n" + "Huong vi: " + this.savour;
        return s;
    }
     
}
