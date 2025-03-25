package Ej3;

import java.util.Scanner;

public class ReadNum {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Primer numero: ");
        number1 = input.nextInt();

        System.out.print("Segundo numero: ");
        number2 = input.nextInt();

        if (number1 == number2) {
            System.out.print("Lo numeros son iguales.\n");
        } else {
            if (number1 > number2) {
                System.out.printf("%d es mas grande.", number1);
            } else {
                System.out.printf("%d es mas grande.", number2);
            }
        }
        input.close();
    }
}