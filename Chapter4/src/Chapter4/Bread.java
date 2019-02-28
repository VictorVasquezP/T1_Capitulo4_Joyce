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
public class Bread {
    private String type;
    private Float calories;
    public Bread(String type, Float calories){
        this.type=type;
        this.calories=calories;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getCalories() {
        return calories;
    }

    public void setCalories(Float calories) {
        this.calories = calories;
    }
    public final static String motto(){
        return "The staff of life";
    }
    @Override
    public String toString(){
        return String.format("%s\nEl pan de tipo %s contiene %.2f calorias",motto(),this.getType(),this.getCalories());
    }
}
