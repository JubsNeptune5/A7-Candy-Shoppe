/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hunter Laverty
 */
public class IceCream extends DessertItem{
private String name;
private int cost;
    public IceCream(String name, int cost){
        this.name = name;
        this.cost = cost;
    }

/**
 * Print out the information for the receipt
 * @return the strings for the receipt
 */
    public String toString(){
        String output =  "";
        //Display the name 
        output += this.name;
        //Turn the cost int in cents to a string in dollars
        String totalcost = DessertShoppe.cents2dollarsAndCents(getCost());
        //Print out a space between the name and where the cost needs to be
        for (int i = this.name.length(); i < DessertShoppe.RECEIPT_WIDTH - totalcost.length()-1; i++){
            output+=" ";
        }
        //Print outt he cost string with the dollar sign
        output += "$"+totalcost;
        return output;
       
    }
/**
 * The cost of the ice cream
 * @return the cost
 */
    @Override
    public int getCost() {
        return cost;
    }
    
}
