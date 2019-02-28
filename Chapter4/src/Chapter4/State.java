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
public class State {
    private String name;
    private Integer population;
    private String capital;
    private Integer num_capital;
    private String poblada;
    private Integer mas;
    public State(String name, Integer population, String capital, Integer num_capital, String poblada, Integer mas){
        this.name=name;
        this.population=population;
        this.capital=capital;
        this.num_capital=num_capital;
        this.poblada=poblada;
        this.mas=mas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Integer getNum_capital() {
        return num_capital;
    }

    public void setNum_capital(Integer num_capital) {
        this.num_capital = num_capital;
    }

    public String getPoblada() {
        return poblada;
    }

    public void setPoblada(String poblada) {
        this.poblada = poblada;
    }

    public Integer getMas() {
        return mas;
    }

    public void setMas(Integer mas) {
        this.mas = mas;
    }
    @Override
    public String toString(){
        return String.format("El estado %s tiene una poblacion de %d personas, visite la capital de %s , la ciudad mas poblada es %s con una cantidad de personas de %d",this.getName(),this.getPopulation(),this.getCapital(),this.getPoblada(),this.getMas());
    }
}
