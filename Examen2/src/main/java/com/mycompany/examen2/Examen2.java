/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen2;

import java.util.Scanner;

/**
 *
 * @author Dariana
 */
public class Examen2 {

    public static void main(String[] args) {
        String vocal;
        Scanner teclado = new Scanner(System.in);
        char[] vocales = new char[10];
        int index = 0;

        
        while (index < 10) {
            System.out.print("Ingrese una vocal (posición " + (index + 1) + "): ");
            vocal = teclado.nextLine().toLowerCase(); // Convertir a minúscula

            
            if (vocal.length() == 1 && (vocal.equals("a") || vocal.equals("e") || vocal.equals("i") || vocal.equals("o") || vocal.equals("u"))) {
                vocales[index] = vocal.charAt(0);
                index++; }
            else{System.out.println("Entrada inválida. Debe ingresar solo una vocal (a, e, i, o, u).");
            }
        }

        System.out.print("Array de vocales ingresadas: ");
        for (char letra : vocales) {
            System.out.print(letra + " ");
       }}}

    

