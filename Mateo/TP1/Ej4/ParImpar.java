package Ej4;

import java.util.Scanner;

public class ParImpar {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Ingrese un numero: ");
        number = input.nextInt();

        int res = number % 2;

        if (res > 0)
            System.out.print("Es impar.");
        else
            System.out.print("Es par.");

        input.close();
    }
}
