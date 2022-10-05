/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRICIPAL;

import enumeracion.coches;
import java.util.Scanner;

/**
 *
 * @author Miguel1
 */
public class PRICIPAL {
    public static void main(String[] args) {
        //String result  = SABER(enumeracion.enumDias.dias.MARTES);
        //System.out.println(result);
         System.out.println("los caballos de audi son" + coches.auidi.getCaballos() + " y su precio es " + coches.auidi.getPrecio());
    }
    public static String SABER(enumeracion.enumDias.dias dia) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("DIME EL DIA");
        String diaA = teclado.nextLine().toUpperCase();
        
         if(dia.equals(enumeracion.enumDias.dias.valueOf(diaA))){
             
            return "es el dia";            
        }else{
             return "no es el dia";
        } 
             /*   
        if(dia.equals(enumeracion.enumDias.dias.MIERCOLES)) {
            return true;            
        }else{
             return false;
        }  
        */
         //COMPARACION DIRECTA
        
    }
}
