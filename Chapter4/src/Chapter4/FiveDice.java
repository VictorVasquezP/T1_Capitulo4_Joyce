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
public class FiveDice {
    private Die one;
    private Die two;
    private Die three;
    private Die four;
    private Die five;
    private Die six;
    private Die seven;
    private Die eight;
    private Die nine;
    private Die ten;
    public FiveDice(Die one, Die two, Die three, Die four, Die five,Die six, Die seven, Die eight, Die nine, Die ten){
        this.one=one;
        this.two=two;
        this.three=three;
        this.four=four;
        this.five=five;
        this.six=six;
        this.seven=seven;
        this.eight=eight;
        this.nine=nine;
        this.ten=ten;
    }

    public Die getOne() {
        return one;
    }

    public void setOne(Die one) {
        this.one = one;
    }

    public Die getTwo() {
        return two;
    }

    public void setTwo(Die two) {
        this.two = two;
    }

    public Die getThree() {
        return three;
    }

    public void setThree(Die three) {
        this.three = three;
    }

    public Die getFour() {
        return four;
    }

    public void setFour(Die four) {
        this.four = four;
    }

    public Die getFive() {
        return five;
    }

    public void setFive(Die five) {
        this.five = five;
    }
    
    public String ganador(){
        return "Las combinaciones para ganar son expresadas de manera jerarquica donde la primera es la mejor combinacion\n5 del mismo tipo\n4 del mismo tipo\n3 del mismo tipo\nUn par";
    }
    public String jugador(){
        return String.format("El jugador saco las combinaciones: "+this.getOne().getNumber()+" "+this.getTwo().getNumber()+" "+this.getThree().getNumber()+" "+this.getFour().getNumber()+" "+this.getFive().getNumber());
    }
    public String maquina(){
        return String.format("La maquina saco las combinaciones: "+this.getSix().getNumber()+" "+this.getSeven().getNumber()+" "+this.getEight().getNumber()+" "+this.getNine().getNumber()+" "+this.getTen().getNumber());
    }
    public Die getSix() {
        return six;
    }

    public void setSix(Die six) {
        this.six = six;
    }

    public Die getSeven() {
        return seven;
    }

    public void setSeven(Die seven) {
        this.seven = seven;
    }

    public Die getEight() {
        return eight;
    }

    public void setEight(Die eight) {
        this.eight = eight;
    }

    public Die getNine() {
        return nine;
    }

    public void setNine(Die nine) {
        this.nine = nine;
    }

    public Die getTen() {
        return ten;
    }

    public void setTen(Die ten) {
        this.ten = ten;
    }
}
