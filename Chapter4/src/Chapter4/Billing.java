/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4;

/**
 *
 * @author Victor
 */
public class Billing {
    public Billing(){
        
    }
    public Double computeBill(Double price){
        return price+(price*0.08);
    }
    public Double computeBill(Double price,Integer order){
        return (price*order)+(price*order*0.08);
    }
    public Double computeBill(Double price,Integer order,Integer cupon){
        return ((price*order)-((price*order)*(cupon*0.010)))+(((price*order)-((price*order)*(cupon*0.010)))*0.08);
    }
    
}
