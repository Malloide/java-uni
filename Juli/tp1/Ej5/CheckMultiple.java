package Ej5;

import java.util.Scanner; // Importa la clase Scanner para la entrada de datos

public class CheckMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario
        
        System.out.print("Ingrese el primer número: "); // Solicita el primer número al usuario
        int num1 = scanner.nextInt(); // Lee el primer número ingresado
        
        System.out.print("Ingrese el segundo número: "); // Solicita el segundo número al usuario
        int num2 = scanner.nextInt(); // Lee el segundo número ingresado
        
        if (num2 == 0) {
            System.out.println("No se puede dividir por cero."); // Maneja el caso de división por cero
        } else if (num1 % num2 == 0) {
            System.out.println(num1 + " es múltiplo de " + num2); // Imprime si el primer número es múltiplo del segundo
        } else {
            System.out.println(num1 + " no es múltiplo de " + num2); // Imprime si el primer número no es múltiplo del segundo
        }
        
        scanner.close(); // Cierra el objeto Scanner para liberar recursos
    }
}
