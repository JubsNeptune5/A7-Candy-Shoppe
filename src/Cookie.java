/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hunter Laverty
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

/**
 * Print out the information for the receipt
 * @return the strings for the receipt
 */
    @Override
    public String toString(){
        String output =  "";
        //Display the number of cookies and the price per dozen on the same line
        output += this.number +" @ $" + DessertShoppe.cents2dollarsAndCents(pricePer12)+ " /dz\n";
        //NEXT LINE
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
 * Get the cost with the  number of cookies nd the price per dozen
 * @return the cost for the number of cookies in cents
 */
    @Override
    public int getCost() {
        //multiply the number of cokkies by the price per dozen divided by 12
        return number * (pricePer12/12);
    }
    
}
