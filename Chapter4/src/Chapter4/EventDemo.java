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
public class EventDemo {
    private Event evento;
    public EventDemo(Event evento){
        this.evento=evento;
    }

    public Event getEvento() {
        return evento;
    }

    public void setEvento(Event evento) {
        this.evento = evento;
    }
    
    @Override
    public String toString(){
        return String.format("Numero de evento %s, numero de invitados %d con un precio por invitado de $35, con un total de precio de $%d, es un %s",this.getEvento().getNumber_e(),this.getEvento().getInvita(),this.getEvento().getPrecio(),this.getEvento().calculate());
    }
}
