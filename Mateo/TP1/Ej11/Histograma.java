package Ej11;

import java.util.Scanner;

public class Histograma {
    public void Programa() {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Ingrese 5 numeros del 1 al 30:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un numero: ");
            int numero = input.nextInt();

            while (numero < 1 || numero > 30) {
                System.out.print("Numero fuera de rango. Ingresa otro dentro del rango: ");
                numero = input.nextInt();
            }

            numeros[i] = numero;

        }

        input.close();

        System.out.println("\nHistograma:");

        for (int num : numeros) {
            for (int j = 0; j < num; j++) {
                System.out.print("*"); // Imprime * sin salto de línea
            }
            System.out.println();

            /*
             * "Forma alternativa"
             * for (int i = 0; i < numeros.length; i++) {
             * int num = numeros[i]; // Accede al elemento en la posición i
             * for (int j = 0; j < num; j++) {
             */
        }
    }
}
