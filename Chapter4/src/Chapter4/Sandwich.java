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
public class Sandwich {
    private Bread pan;
    private SandwichFilling sandw;
    public Sandwich(Bread pan, SandwichFilling sandw){
        this.pan=pan;
        this.sandw=sandw;
    }
    public Bread getPan() {
        return pan;
    }
    public void setPan(Bread pan) {
        this.pan = pan;
    }
    public SandwichFilling getSandw() {
        return sandw;
    }
    public void setSandw(SandwichFilling sandw) {
        this.sandw = sandw;
    }
    public Float calculateCalorias(){
        return this.getPan().getCalories()+this.getSandw().getCalories();
    }
    public String values(){
        return String.format("El Sandwich es de pan de %s relleno de %s, contiene %.2f calorias",this.getPan().getType(),this.getSandw().getType(),this.calculateCalorias());
    }
}
