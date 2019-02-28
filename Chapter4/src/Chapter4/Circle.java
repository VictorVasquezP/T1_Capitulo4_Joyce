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
public class Circle {
    private Double radio;
    private Double diametro;
    private Double area;
    public Circle(){
        this.radio=(double)1;
        setArea();
        setDiametro();
    }
    public Circle(Double radio){
        this.radio=radio;
        setArea();
        setDiametro();
    }
    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getDiametro() {
        return diametro;
    }

    public void setDiametro() {
        this.diametro =2*this.getRadio();
    }

    public Double getArea() {
        return area;
    }

    public void setArea() {
        this.area = Math.PI*Math.pow(this.getRadio(),2);
    }
    @Override
    public String toString(){
        return String.format("Radio: %.3f, Diametro: %.3f, Area: %.3f",this.getRadio(),this.getDiametro(),this.getArea());
    }
}
