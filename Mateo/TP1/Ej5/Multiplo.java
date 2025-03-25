package Ej5;

import java.util.Scanner;

public class Multiplo {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Ingresa el primer numero: ");
        number1 = input.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        number2 = input.nextInt();

        int res = number1 % number2;
        if (res == 0)
            System.out.printf("El numero %d es multiplo de %d.\n", number1, number2);
        else
            System.out.printf("El numero %d NO es multiplo de %d.\n", number1, number2);

        input.close();
    }
}