package Ej12;

import java.util.Scanner;

public class Duplicados {

    public void NumerosDuplicados() {
        Scanner input = new Scanner(System.in);
        int numeros[] = new int[20];

        System.out.println("Ingrese 20 numeros: ");

        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese un numero: ");
            int numero = input.nextInt();

            numeros[i] = numero;

        }

        System.out.println("Números sin duplicados:");

        for (int i = 0; i < numeros.length; i++) {
            boolean esDuplicado = false;

            for (int j = 0; j < i; j++) {
                if (numeros[i] == numeros[j]) {
                    esDuplicado = true;
                    break;
                }
            }

            if (!esDuplicado) {
                System.out.println(numeros[i]);
            }
        }

        input.close();
    }
}
