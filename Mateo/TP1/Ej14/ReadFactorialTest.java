package Ej14;

import java.util.Scanner;

public class ReadFactorialTest {
    public static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un numero para hacer el factorial: ");
        int numero = input.nextInt();

        ReadFactorial rf = new ReadFactorial();

        long resultado = rf.factorial(numero);

        System.out.println("El factorial de " + numero + " es: " + resultado);

        input.close();
    }
}