package Ej10;
import java.util.Scanner; // Importa la clase Scanner para la entrada de datos

public class FindSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario
        
        System.out.print("Ingrese la cantidad de números a comparar: "); // Solicita el número de valores a ingresar
        int cantidad = scanner.nextInt(); // Lee la cantidad de números a ingresar
        
        if (cantidad <= 0) {
            System.out.println("La cantidad de números debe ser mayor a cero."); // Maneja el caso de entrada inválida
        } else {
            System.out.print("Ingrese un número: "); // Solicita el primer número
            int menor = scanner.nextInt(); // Lee el primer número y lo asume como el menor
            
            for (int i = 1; i < cantidad; i++) {
                System.out.print("Ingrese un número: ");
                int num = scanner.nextInt(); // Lee los siguientes números
                
                if (num < menor) {
                    menor = num; // Actualiza el menor si se encuentra un número más pequeño
                }
            }
            
            System.out.println("El número más pequeño es: " + menor); // Imprime el menor número encontrado
        }
        
        scanner.close(); // Cierra el objeto Scanner para liberar recursos
    }
}
