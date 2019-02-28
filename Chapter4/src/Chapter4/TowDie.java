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
public class TowDie {
    private Die dado;
    private Die dado2;
    public TowDie(Die dado, Die dado2){
        this.dado=dado;
        this.dado2=dado2;
    }

    public Die getDado() {
        return dado;
    }

    public void setDado(Die dado) {
        this.dado = dado;
    }
    public Die getDado2() {
        return dado2;
    }

    public void setDado2(Die dado2) {
        this.dado2 = dado2;
    }
    @Override
    public String toString(){
        return String.format("El dado 1 dio: "+this.getDado().getNumber()+"  El dado 2 dio: "+this.getDado2().getNumber());
    }
}
