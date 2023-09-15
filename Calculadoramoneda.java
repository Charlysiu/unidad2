/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoramoneda;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Calculadoramoneda {

    public static void main(String[] args) {
    
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Ingresa cantidad");
        double cantidad = lectura.nextDouble();
        
        
        double euro = cantidad / 18.21;
        double dolar = cantidad / 17.09;
        double yen = cantidad / 0.12;
        double libras = cantidad / 21.18;
        
        System.out.println("Hola su cantidad es " + cantidad
                + " en euros es " + euro
                + " en dolares es " + dolar
                + " en yenes es " + yen
                + " en libras es " + libras);
       
      
    }
}
