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
public class FormLetterWriter {
    public FormLetterWriter(){
        
    }
    public String displaySalutation(String last_name){
        return String.format("Estimado Sr. o Sra. %s",last_name);
    }
     public String displaySalutation(String last_name, String name){
        return String.format("Estimado(a) %s %s, “Gracias por su pedido reciente”",name,last_name);
    }
}
