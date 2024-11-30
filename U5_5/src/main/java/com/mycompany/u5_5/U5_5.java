/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u5_5;

import java.util.Scanner;

/**
 *
 * @author Dariana
 */
public class U5_5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Paso 1: Solicitar el tamaño del array
        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        int tamaño = teclado.nextInt();

        int[] numeros = new int[tamaño];

        // Paso 2: Llenar el array con números ingresados por el usuario
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = teclado.nextInt();
        }

        // Paso 3: Ordenar el array usando el método de burbuja
        for (int i = 0; i < tamaño - 1; i++) {
            for (int j = 0; j < tamaño - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    // Intercambiar elementos
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        // Paso 4: Mostrar el arreglo ordenado
        System.out.println("Arreglo ordenado en orden ascendente:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }}}

