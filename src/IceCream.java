/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHANGE_THIS_TO_YOUR_NAME
 */
public class IceCream extends DessertItem{
private String name;
private int cost;
    public IceCream(String name, int cost){
        this.name = name;
        this.cost = cost;
    }

  
    public String toString(){
      String output = "---------\n";
        output += this.name;
        return output;
       
    }

    @Override
    public int getCost() {
        return cost;
    }
    
}
