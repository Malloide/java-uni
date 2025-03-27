package Ej3;
import java.util.Scanner; // Importa la clase Scanner para la entrada de datos

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario
        
        System.out.print("Ingrese el primer número: "); // Solicita el primer número al usuario
        double num1 = scanner.nextDouble(); // Lee el primer número ingresado
        
        System.out.print("Ingrese el segundo número: "); // Solicita el segundo número al usuario
        double num2 = scanner.nextDouble(); // Lee el segundo número ingresado
        
        if (num1 > num2) {
            System.out.println(num1 + " es más grande"); // Imprime el número más grande
        } else if (num2 > num1) {
            System.out.println(num2 + " es más grande"); // Imprime el número más grande
        } else {
            System.out.println("Los números son iguales"); // Imprime si los números son iguales
        }
        
        scanner.close(); // Cierra el objeto Scanner para liberar recursos
    }
}


