/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.GregorianCalendar;
import Chapter4.Billing;
import Chapter4.BirdSighting;
import Chapter4.BirdSighting2;
import Chapter4.BloodType;
import Chapter4.Bread;
import Chapter4.CertificateOfDeposit;
import Chapter4.Circle;
import Chapter4.Die;
import Chapter4.Event;
import Chapter4.EventDemo;
import Chapter4.Factor;
import Chapter4.FormLetterWriter;
import Chapter4.MathTest;
import Chapter4.Paciente;
import Chapter4.Sandwich;
import Chapter4.SandwichFilling;
import Chapter4.State;
import Chapter4.TowDie;
import Chapter4.FiveDice;
import Chapter4.Rental;
/**
 *
 * @author Victor
 */
public class Main {
    public static void main(String[] args) {
        /*
        System.out.println("\tFormLetterWriter");
        FormLetterWriter fw = new FormLetterWriter();
        System.out.println(fw.displaySalutation("Poblete"));
        System.out.println(fw.displaySalutation("Poblete","Victor"));
        System.out.println("\tBilling");
        Billing bil = new Billing();
        System.out.println(bil.computeBill(30.5));
        System.out.println(bil.computeBill(30.5,5));
        System.out.println(bil.computeBill(30.5,5,25));
        System.out.println("\tBirdSighting");
        BirdSighting bird = new BirdSighting("Palomas",2,1);
        BirdSighting2 bird2 = new BirdSighting2("Palomas",2,1);
        System.out.println(bird2.imprimir());
        System.out.println("\tBloodData & Patient");
        Paciente P=new Paciente();
        Paciente P2=new Paciente(724,(byte)20, BloodType.O, Factor.POSITIVO);
        System.out.println(P2.imprimir());
        System.out.println("\tBread");
        Bread bre1 = new Bread("centeno",(float)23.5);
        Bread bre2 = new Bread("trigo",(float)13.5);
        Bread bre3 = new Bread("maiz",(float)43.5);
        System.out.println(bre1);
        System.out.println(bre2);
        System.out.println(bre3);
        System.out.println("\tSandwichFilling");
        SandwichFilling sand = new SandwichFilling("Ensalada de huevo",(float)56.4);
        SandwichFilling sand2 = new SandwichFilling("Atún",(float)102.5);
        SandwichFilling sand3 = new SandwichFilling("Quesillo",(float)67.34);
        System.out.println(sand);
        System.out.println(sand2);
        System.out.println(sand3);
        System.out.println("\tSandwich");
        Sandwich sandw1 = new Sandwich(bre1,sand); 
        Sandwich sandw2 = new Sandwich(bre2,sand2);
        Sandwich sandw3 = new Sandwich(bre3,sand3);
        System.out.println(sandw1.values());
        System.out.println(sandw2.values());
        System.out.println(sandw3.values());
        System.out.println("\tCircle");
        Circle circulo = new Circle();
        System.out.println(circulo);
        Circle circulo2 = new Circle((double)3);
        System.out.println(circulo2);
        System.out.println("\tOperaciones con Math");
        MathTest mat = new MathTest();
        System.out.println("Inciso a)");
        System.out.println(mat.a((double)37));
        System.out.println("Inciso b)");
        System.out.println(mat.b((double)300));
        System.out.println("Inciso c)");
        System.out.println(mat.cy((double)22.8));
        System.out.println("Inciso d)");
        System.out.println(mat.d('D', 71));
        System.out.println("Inciso e)");
        System.out.println(mat.e());
        
        System.out.println("\tNextMonth & YearEnd");
        GregorianCalendar calen=new GregorianCalendar(13,"febrero",2019);
        System.out.println("\tCertificateOfDeposit");
        System.out.println(calen.toMes());
        CertificateOfDeposit co = new CertificateOfDeposit(14234,"Poblete",4000,calen);
        System.out.println(co);
        System.out.println("\tState");
        State estado = new State("Oaxaca",424234,"Oaxaca",45673,"Istmo",74563);
        System.out.println(estado);
        System.out.println("\tDie & TowDie");
        Die dado1 = new Die();
        Die dado2 = new Die();
        TowDie dados = new TowDie(dado1, dado2);
        System.out.println(dados);
        Die dado3 = new Die();
        Die dado4 = new Die();
        Die dado5 = new Die();
        Die dado6 = new Die();
        Die dado7 = new Die();
        Die dado8 = new Die();
        Die dado9 = new Die();
        Die dado10 = new Die();
        Die dado11 = new Die();
        Die dado12 = new Die();
        FiveDice fiv = new FiveDice(dado3,dado4,dado5,dado6,dado7,dado8,dado9,dado10,dado11,dado12);
        System.out.println(fiv.ganador()+"\n");
        System.out.println(fiv.jugador());
        System.out.println(fiv.maquina());
        System.out.println("\tEvent & EventDemo");
        Event evento1 = new Event ();
        Event evento2 = new Event ("M234",67);
        EventDemo ev = new EventDemo(evento1);
        EventDemo ev2 = new EventDemo(evento2);
        System.out.println(ev);
        System.out.println(ev2);
        */
        System.out.println("\tRental");
        Rental rent = new Rental();
        Rental rent2 = new Rental("A001",134);
        System.out.println(rent.setHoursAndMinutes());
        System.out.println("\n"+rent2.setHoursAndMinutes());
        
    }
}
