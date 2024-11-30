/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u5_3;

import java.util.Scanner;

/**
 *
 * @author Dariana
 */
public class U5_3 {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[8];
        int mayor, menor;

        System.out.print("Ingrese un número entero: ");
        numeros[0] = teclado.nextInt();
        mayor = menor = numeros[0];

        for (int i = 1; i < 8; i++) {
            System.out.print("Ingrese un número entero: ");
            numeros[i] = teclado.nextInt();
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);}}