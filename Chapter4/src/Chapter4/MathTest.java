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
public class MathTest {
    public Double a(Double a){
        return Math.sqrt(a);
    }
    public String b(Double a){
        return String.format("El sen(a): %.4f, el cos(a): %.4f",Math.sin(a),Math.cos(a));
    }
    //ceil redondea hacia abajo, floor hacia arriba, y round hacia el mas cercano
    public String cy(Double a){
        return String.format("El floor: "+Math.floor(a)+", ceiling: "+Math.ceil(a)+", round: "+Math.round(a));
    }
    public Integer e(){
        return (int)(Math.random()*20)+1;
    }
    public String d(Character ch, Integer a){
        return String.format("Minimo: "+Math.min(ch, a)+"   Maximo: "+Math.max(ch, a));
    }
    
}
