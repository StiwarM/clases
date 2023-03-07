/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
 import java.io.*;
public class Recursividad {
   
 
    public static void main(String[] args) {
        int base = 4;
        int exponente = 1;
        int resultado = potencia(base, exponente);
        System.out.println(base + " elevado a la " + exponente + " es igual a " + resultado);
    }

    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }
}
    

