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
public class Rental {
    /*
    La clase de alquiler contiene dos estáticas finales públicas
campos que contienen la cantidad de minutos en una hora y la tarifa de alquiler por hora
($ 40) y cuatro campos privados que tienen un número de contrato, número de horas
Para el alquiler, el número de minutos en una hora y el precio. También contiene
Dos métodos de conjuntos públicos y cuatro métodos de obtención públicos.
    Un constructor acepta un número de contrato y un número de minutos como
parámetros Pase estos valores al setContractNumber () y
Los métodos setHoursAndMinutes (), respectivamente. El setHoursAndMinutes ()
El método calculará automáticamente las horas, los minutos adicionales y el precio.
    
    The other constructor is a default constructor that passes “A000” and 0 to the
two-parameter constructor.
    */
    public static final Integer HORA=60;
    public static final Integer TARIFA=40;
    private String contrato;
    private Integer horas;
    private Integer invitados;
    private Integer price;
    public Rental(String contrato, Integer horas){
        this.contrato=contrato;
        this.horas=horas;
    }
    public Rental(){
        this.contrato="A000";
        this.horas=0;
    }
    public String setHoursAndMinutes (){
        return String.format("Horas de alquiler: %d\nMinutos de alquiler: %d\nPrecio total: %d",this.getHoras()/HORA,this.getHoras()%HORA,(this.getHoras()/HORA)*TARIFA+(this.getHoras()%HORA));
    }
    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Integer getInvitados() {
        return invitados;
    }

    public Integer getPrice() {
        return price;
    }
    
    
    
    
}
