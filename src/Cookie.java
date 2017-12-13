/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHANGE_THIS_TO_YOUR_NAME
 */
public class Cookie extends DessertItem {
    
    private String name;
    private int number;
    private int pricePer12;
    
    public Cookie(String name, int number, int pricePer12){
        this.name =name;
        this.number = number;
        this.pricePer12 = pricePer12;
        
    }

    
    @Override
    public String toString(){
         String output = "---------\n";
        output += this.number +" @ " + this.pricePer12+ "\n";
        output += this.name + "\n";
        return output;
    }

    @Override
    public int getCost() {
        return number * pricePer12;
    }
    
}
