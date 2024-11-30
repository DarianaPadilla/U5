/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u5_2;

import java.util.Scanner;

public class U5_2 {

    public static void main(String[] args) {
        
         Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[5];
        int suma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un número entero: ");
            numeros[i] = teclado.nextInt();
            suma += numeros[i];
        }

        System.out.println("La suma de los elementos es: " + suma);}}