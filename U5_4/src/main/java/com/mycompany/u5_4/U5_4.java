/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u5_4;

import java.util.Scanner;

/**
 *
 * @author Dariana
 */
public class U5_4 {

    public static void main(String[] args) {
       Scanner  teclado = new Scanner(System.in);

        int[] numeros = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Ingrese un número entero: ");
            numeros[i] = teclado.nextInt();
        }

        System.out.print("Array invertido: ");
        for (int i = 5; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }}