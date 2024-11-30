/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Dariana
 */
public class Examen1 {

    public static void main(String[] args) {
        String [ ] kpop = { "BLACKPINK", "STRAY KIDS", "TWICE", "(G)I-DLE", "NEWJEANS",
                "TOMORROW x TOGETHER", "ENHYPEN", "BTS", " ", "SEVENTEEN", " ", " ", "REDVELVET",
                " ","LE SSERAFIM"
        };
       

        //Agregar información en los espacios en blanco del array
        String other;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < kpop.length; i++) {
            String grupoActual = kpop[i];
            if (grupoActual.equals(" ")) {
                System.out.println("Ingrese otro grupo: ");
                other = teclado.nextLine();
                kpop[i] = other;
            }  
        }
        System.out.println("Impresion de Array: "+ Arrays.toString(kpop));

        String integrantes;
        String canciones;

        for (int i = 0; i < kpop.length; i++) {
            System.out.println("Ingresa tu bias " + kpop[i]+ ": ");
            integrantes = teclado.nextLine();
            System.out.println("Ingresa tu cancion favorita de " + kpop[i]+ ": ");
            canciones = teclado.nextLine();
            kpop[i] = kpop[i].concat(" - ").concat(integrantes);
            kpop[i] = kpop[i].concat(" - ").concat(canciones);

        }
        System.out.println("Impresion de Array: "+ Arrays.toString(kpop));

    }
}
