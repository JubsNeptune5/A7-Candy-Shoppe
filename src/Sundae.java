/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hunter Laverty
 */
public class Sundae extends IceCream {

    private String toppingName;
    private int toppingCost;

    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        super(icName, icCost);
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
    }

    /**
     *Add the cost of the toppings to the cost of the ice cream
     * @return the cost of the sundae
     */
    @Override
    public int getCost() {
        // add the ice cream price nad the topping price
        return super.getCost() + toppingCost;
    }

    /**
     * Print out the information for the receipt
     *
     * @return the strings for the receipt
     */
    @Override
    public String toString() {
        String output = "";
        //Print out the topping name on one line
        output += toppingName + " Sundae with\n";
        //NEXT LINE
        //Print out what was in the toString mthod from the ice cream(super) class 
        output += super.toString();
        return output;
    }

}
