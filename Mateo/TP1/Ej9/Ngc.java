package Ej9;

import java.util.Scanner;

public class Ngc {

    public void Cuenta() {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa 10 numeros");

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int counter = 0; counter < 10; counter++) {
            System.out.print("Ingresa el numero: ");
            int numero = input.nextInt();

            if (numero > max) {
                max = numero;
            }

            if (numero < min) {
                min = numero;
            }
        }

        input.close();
        System.out.printf("El numero mas grande es %d y el mas chico es %d", max, min);

    }
}