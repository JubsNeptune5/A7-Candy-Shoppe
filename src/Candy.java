/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hunter Laverty
 */
public class Candy extends DessertItem {

    private String name;
    private double weight;
    private int pricePerLbs;

    public Candy(String name, double weight, int pricePerLbs) {
        this.name = name;
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }
/**
 * Print out the information for the receipt
 * @return the strings for the receipt
 */
    @Override
    public String toString() {
        String output =  "";
        //Display the weight and the price per pounds in one line
        output += this.weight +" lbs. @ $" + DessertShoppe.cents2dollarsAndCents(pricePerLbs)+ " /lb.\n";
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
     * Method to find the price using the weight and the cost per pound
     *
     * @return the total cost
     */
    @Override
    public int getCost() {
        //Change the price to a double
        double tempPrice = (double) (pricePerLbs);
        //Multiply the weight by the cents
        double cost = weight * pricePerLbs;
        //Change cost back to an int
        int totalCost = (int) (cost);
        return totalCost;
    }
}
