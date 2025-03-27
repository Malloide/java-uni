package Ej2;
import java.util.Scanner; // Importa la clase Scanner para la entrada de datos

public class CircleCalculator {
    public static void main(String[] args) {
        final double PI = 3.14159; // Define una constante para el valor de PI
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario
        
        System.out.print("Ingrese el radio del círculo: "); // Solicita al usuario que ingrese el radio
        double radio = scanner.nextDouble(); // Lee el radio ingresado por el usuario y lo almacena en una variable
        
        double diametro = 2 * radio; // Calcula el diámetro del círculo (2 * radio)
        double circunferencia = 2 * PI * radio; // Calcula la circunferencia del círculo (2 * PI * radio)
        double area = PI * radio * radio; // Calcula el área del círculo (PI * radio^2)
        
        System.out.println("Diámetro: " + diametro); // Imprime el diámetro del círculo
        System.out.println("Circunferencia: " + circunferencia); // Imprime la circunferencia del círculo
        System.out.println("Area: " + area); // Imprime el área del círculo
        
        scanner.close(); // Cierra el objeto Scanner para liberar recursos
    }
}
