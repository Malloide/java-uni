package Ej10;

import java.util.Scanner;

public class MinNum {

    public void Minimos() {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa cuantos numeros quieres ingrear: ");
        int ingresos = input.nextInt();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < ingresos; i++) {
            System.out.print("Ingresa el numero: ");
            int numero = input.nextInt();

            if (numero < min) {
                min = numero;
            }
        }
        input.close();

        System.out.printf("El numero mas chico es el %d. ", min);
    }
}
