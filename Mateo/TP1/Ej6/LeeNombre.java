package Ej6;

import java.util.Scanner;

public class LeeNombre {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String nombre;
        String apellido;

        System.out.print("Ingresa tu nombre: ");
        nombre = input.nextLine();

        System.out.print("Ingresa tu apellido: ");
        apellido = input.nextLine();

        String nombreCompleto = nombre.concat(" ").concat(apellido);
        System.out.printf("Tu nombre completo es: %s", nombreCompleto);

        input.close();
    }
}
