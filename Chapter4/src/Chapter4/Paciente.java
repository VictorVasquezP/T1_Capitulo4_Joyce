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
public class Paciente {
    private Integer id;
    private Byte age;
    private BloodDate bd;
    public Paciente(){
        this.id=0;
        this.age=0;
        this.bd=new BloodDate();
    }
    public Paciente(Integer id,Byte age,BloodType type,Factor factor){
        this.id=id;
        this.age=age;
        this.bd=new BloodDate(type, factor);
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Byte getAge() {
        return age;
    }
    public void setAge(Byte age) {
        this.age = age;
    }
    public BloodDate getBd() {
        return bd;
    }
    public void setBd(BloodDate bd) {
        this.bd = bd;
    }
    public String imprimir(){
        return String.format("El paciente de edad:"+this.getAge()+ ", ID: "+this.getId()+", Tipo de sangre: "+this.getBd().getBloodType()+" "+this.getBd().getFactor());
    }
}
