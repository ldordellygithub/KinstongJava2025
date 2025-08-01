package ArraysToday;
import java.util.Scanner;
import  java.util.Arrays;
public class ArrayFile {


        public  static void main(String[] args) {
            int[] numeros = {12, 45, 78, 34, 56, 89, 23, 67, 90, 11};

            boolean continuar = true;
            Scanner input = new Scanner(System.in);

            do {
                boolean encontrado = false;
                System.out.println("Ingrese un número a buscar:");
                int numeroBuscado = input.nextInt();


                for (int i = 0; i < numeros.length; i++) {
                    if (numeros[i] == numeroBuscado) {
                        System.out.println("El número " + numeroBuscado + " fue encontrado en la posición " + i);
                        encontrado = true;
                        break; // Salir del bucle si se encuentra el número
                    }
                }

                if (!encontrado) {
                    System.out.println("El número " + numeroBuscado + " no fue encontrado en el arreglo.");
                }
                //  si  enceuntra  se le  informa al usuario si  continuar  otro busqueda  con un methodo
                continuar = deseaContinuar(input);

            } while (continuar);
            input.close();

        }

    private  static  boolean  deseaContinuar(Scanner input){
        System.out.println("¿Desea buscar otro número? (s/n)");
        char respuesta = input.next().charAt(0);
        if (respuesta == 's' || respuesta == 'S') {
            return true; // Continuar buscando
        } else {
            System.out.println("Saliendo del programa.");
            return false;
        }
    }

}




