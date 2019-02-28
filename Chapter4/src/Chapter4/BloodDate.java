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
public class BloodDate {
     private BloodType bloodType;
    private Factor factor;
    public BloodDate(){
        this.bloodType=bloodType.O;
        this.factor=factor.POSITIVO;
    }
    public BloodDate(BloodType bloodType,Factor factor){
        this.bloodType=bloodType;
        this.factor=factor;
    }
    public BloodType getBloodType() {
        return bloodType;
    }
    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }
    public Factor getFactor() {
        return factor;
    }
    public void setFactor(Factor factor) {
        this.factor = factor;
    }
}
