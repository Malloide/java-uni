package Ej8;
import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario
        
        int positivos = 0, negativos = 0, ceros = 0; // Variables para contar positivos, negativos y ceros
        
        System.out.println("Ingrese diez números:"); // Solicita los números al usuario
        
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt(); // Lee el número ingresado
            
            if (num > 0) {
                positivos++; // Incrementa el contador de positivos
            } else if (num < 0) {
                negativos++; // Incrementa el contador de negativos
            } else {
                ceros++; // Incrementa el contador de ceros
            }
        }
        
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);
        
        scanner.close(); // Cierra el objeto Scanner para liberar recursos
    }
}
