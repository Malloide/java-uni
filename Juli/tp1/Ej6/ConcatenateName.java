package Ej6;

import java.util.Scanner;

public class ConcatenateName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("ingrese su apellido: ");
        String apellido = scanner.nextLine();

        System.out.println("nombre completo: " + nombre + " " + apellido);

        scanner.close();
    }
}
