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
public class CertificateOfDeposit {
    private Integer certificado;
    private String apellido;
    private Integer saldo;
    private GregorianCalendar emision;
    private Integer vencimiento;
    public CertificateOfDeposit(Integer certificado, String apellido, Integer saldo, GregorianCalendar emision){
        this.certificado=certificado;
        this.apellido=apellido;
        this.saldo=saldo;
        this.emision=emision;
        setVencimiento();
    }

    public Integer getCertificado() {
        return certificado;
    }

    public void setCertificado(Integer certificado) {
        this.certificado = certificado;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public GregorianCalendar getEmision() {
        return emision;
    }

    public void setEmision(GregorianCalendar emision) {
        this.emision = emision;
    }

    public Integer getVencimiento() {
        return vencimiento;
    }
     public void setVencimiento() {
        this.vencimiento = this.getEmision().getAnio()+1;
    }
    @Override
    public String toString(){
        return String.format("El numero de certificado es: "+this.getCertificado()+", a nombre de "+this.getApellido()
                +", con un saldo de $"+this.getSaldo()+"\nLa fecha de emision fue: "+this.getEmision().getDia()+"/"+this.getEmision().getMes()+"/"+
                this.getEmision().getAnio()+", y la fecha de vencimiento es: "+this.getEmision().getDia()+"/"+this.getEmision().getMes()+"/"+this.getVencimiento());
                                                                         
                
    }
}
