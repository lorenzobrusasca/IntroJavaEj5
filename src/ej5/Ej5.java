/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    /*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().*/
    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese un número");
        double num = leer.nextDouble();
        
        System.out.println("El doble es:" + (int)(num*2) + "\nEl triple es:" + (int)(num*3) + "\nLa raiz cuadrada es:" + Math.sqrt(num) );
        
       
        
        
    }
    
}
