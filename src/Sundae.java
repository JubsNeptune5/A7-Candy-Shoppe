/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHANGE_THIS_TO_YOUR_NAME
 */
public class Sundae extends IceCream{
    private String toppingName;
    private  int toppingCost;

    
    public Sundae(String icName, int icCost, String toppingName, int toppingCost){
       super(icName,icCost);
       this.toppingName = toppingName;
       this.toppingCost = toppingCost;
    }
    
    @Override
    public int getCost(){
        return super.getCost() + toppingCost;
    }
    
    @Override
    public String toString(){
        String fromIceCream = super.toString();
        fromIceCream += toppingName;
        return fromIceCream;
    }
    
}
