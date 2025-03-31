package Ej9;
import java.util.Scanner;

public class MinMaxNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE; // Inicializamos con el valor mínimo posible
        int min = Integer.MAX_VALUE; // Inicializamos con el valor máximo posible

        System.out.println("Ingresa 10 números:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int num = scanner.nextInt();

            // Actualizamos el máximo y el mínimo
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("El número más grande es: " + max);
        System.out.println("El número más pequeño es: " + min);

        scanner.close();
    }
}
