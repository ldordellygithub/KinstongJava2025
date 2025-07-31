package org.example;

import  java.util.Scanner;
import  java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int[] numeros = {12,45,78,34,56,89,23,67,90,11};
        boolean encontrado = false;
        Scanner input = new Scanner(System.in);

        do {
                System.out.println("Ingrese un número a buscar:");
                int numeroBuscado = input.nextInt();


                for (int i = 0; i < numeros.length; i++) {
                    System.out.println(" Buscando  el numero ingresaso" + " " + numeroBuscado );
                    if (numeros[i] == numeroBuscado) {
                        System.out.println("El número " + numeroBuscado + " fue encontrado en la posición " + i);
                        encontrado = true;
                        break; // Salir del bucle si se encuentra el número
                    }

                }
                if (!encontrado) {
                    System.out.println("El número " + numeroBuscado + " no fue encontrado en el arreglo.");
                    System.out.println("¿Desea buscar otro número? (s/n)");
                    char respuesta = input.next().charAt(0);
                    if (respuesta != 's' && respuesta != 'S') {
                        System.out.println("Saliendo del programa.");
                        break; // Salir del bucle si el usuario no desea buscar otro número
                    } else {
                        encontrado = false; // Reiniciar la variable para la próxima búsqueda
                        System.out.println("Reiniciando la búsqueda...");
                    }
                }
        } while (encontrado == false);

    }
}
