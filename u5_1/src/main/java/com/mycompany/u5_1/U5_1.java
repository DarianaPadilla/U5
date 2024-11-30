/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u5_1;

import java.util.Scanner;

/**
 *
 * @author Dariana
 */
public class U5_1 {

    public static void main(String[] args) {
        
       Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[10];
        int pares = 0, impares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número entero: ");
            numeros[i] = teclado.nextInt();

            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Números pares: " + pares);
        System.out.println("Números impares: " + impares);}}