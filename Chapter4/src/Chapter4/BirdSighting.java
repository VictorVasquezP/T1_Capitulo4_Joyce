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
public class BirdSighting {
    private String species;
    private Integer number;
    private Integer day;
    public BirdSighting(){
        this.species="robin";
        this.number=1;
        this.day=1;
    }
    public BirdSighting(String species, Integer number, Integer day){
        this.species=species;
        this.number=number;
        this.day=day;
    }
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }
    public String imprimir(){
        return String.format("El dia %d de Abril fueron vistos %d aves de la especie %s",this.getDay(),this.getNumber(),this.getSpecies());
    }
}
