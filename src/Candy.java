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

    @Override
    public String toString() {
        String output = "------------------------------\n";
        output += this.weight +" " + this.pricePerLbs+ "\n";
        output += this.name + "\n";
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
