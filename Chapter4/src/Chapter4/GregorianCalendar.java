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
public class GregorianCalendar {
    private Integer dia;
    private String mes;
    private Integer anio;
    public GregorianCalendar(Integer dia, String mes, Integer anio){
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
    }
    public Integer getDia() {
        return dia;
    }
    public void setDia(Integer dia) {
        this.dia = dia;
    }
    public String getMes() {
        return mes;
    }
    public void setMes(String mes) {
        this.mes = mes;
    }
    public String converter(){
        return this.getMes().toUpperCase();
    }
    public String toMes(){
        Integer resta=0,dia_anio=0;
        switch(this.converter()){
            case "ENERO":
                resta=31-this.getDia();
                dia_anio=365-this.getDia();
                break;
            case "FEBRERO":
                resta=28-this.getDia();
                dia_anio=365-(this.getDia()+31);
                break;
            case "MARZO":
                resta=31-this.getDia();
                dia_anio=365-(this.getDia()+59);
                break;
            case "ABRIL":
                resta=30-this.getDia();
                dia_anio=365-(this.getDia()+90);
                break;
            case "MAYO":
                resta=31-this.getDia();
                dia_anio=365-(this.getDia()+121);
                break;
            case "JUNIO":
                resta=30-this.getDia();
                dia_anio=365-(this.getDia()+152);
                break;
            case "JULIO":
                resta=31-this.getDia();
                dia_anio=365-(this.getDia()+182);
                break;
            case "AGOSTO":
                resta=31-this.getDia();
                dia_anio=365-(this.getDia()+213);
                break;
            case "SEPTIEMBRE":
                resta=30-this.getDia();
                dia_anio=365-(this.getDia()+244);
                break;
            case "OCTUBRE":
                resta=31-this.getDia();
                dia_anio=365-(this.getDia()+274);
                break;
            case "NOVIEMBRE":
                resta=30-this.getDia();
                dia_anio=365-(this.getDia()+304);
                break;
            case "DICIEMBRE":
                resta=31-this.getDia();
                dia_anio=365-(this.getDia()+334);
                break;
        }
        return String.format("Los días faltantes para el proximo mes son: "+resta+", y lo dias restantes en el año son: "+dia_anio);
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }
}
