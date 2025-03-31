package Ej11;
import java.util.Scanner; // Importa la clase Scanner para la entrada de datos

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario
        
        System.out.println("Ingrese cinco números entre 1 y 30:"); // Solicita cinco números al usuario
        
        for (int i = 0; i < 5; i++) {
            int num;
            do {
                System.out.print("Número " + (i + 1) + ": ");
                num = scanner.nextInt(); // Lee un número ingresado
                if (num < 1 || num > 30) {
                    System.out.println("Por favor, ingrese un número entre 1 y 30.");
                }
            } while (num < 1 || num > 30); // Verifica que el número esté en el rango válido
            
            for (int j = 0; j < num; j++) {
                System.out.print("*"); // Imprime el histograma con '*'
            }
            System.out.println(); // Salto de línea después de cada histograma
        }
        
        scanner.close(); // Cierra el objeto Scanner para liberar recursos
    }
}

