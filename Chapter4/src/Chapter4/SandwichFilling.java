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
public class SandwichFilling extends Bread{
    
    public SandwichFilling(String type, Float calories) {
        super(type, calories);
    }   
    @Override
    public String toString(){
        return String.format("El Sandwich es de "+this.getType()+" con "+this.getCalories()+" calorias");
    }
}
