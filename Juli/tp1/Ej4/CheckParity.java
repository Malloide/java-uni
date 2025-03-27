package Ej4;
import java.util.Scanner; // Importa la clase Scanner para la entrada de datos

public class CheckParity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario
        
        System.out.print("Ingrese un número: "); // Solicita un número al usuario
        int num = scanner.nextInt(); // Lee el número ingresado
        
        if (num % 2 == 0) {
            System.out.println("El número " + num + " es par."); // Imprime si el número es par
        } else {
            System.out.println("El número " + num + " es impar."); // Imprime si el número es impar
        }
        
        scanner.close(); // Cierra el objeto Scanner para liberar recursos
    }
}
