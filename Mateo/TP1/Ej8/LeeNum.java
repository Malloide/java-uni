package Ej8;

import java.util.Scanner;

public class LeeNum {

    public void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa 10 numeros y te va a decir cuantos hay de cada uno");

        int ceros = 0;
        int positivos = 0;
        int negativos = 0;

        for (int counter = 0; counter < 10; counter++) {
            System.out.print("Ingresa el numero: ");
            int numero = input.nextInt();

            if (numero == 0) {
                ceros++;
            }
            if (numero > 0) {
                positivos++;
            }
            if (numero < 0) {
                negativos++;
            }
        }

        System.out.printf("Ubieron %d positivos, %d negativos y %d ceros.", positivos, negativos, ceros);

        input.close();
    }
}
