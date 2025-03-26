package Ej1;

import  java.util.Scanner;

public class Sumar {
    public void suma(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("mete un numerito: ");
        int numero1 = input.nextInt();

        System.out.print("mete un numerito: ");
        int numero2 = input.nextInt();

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int mult = numero1 * numero2;
        int div = numero1 / numero2;

        System.out.printf("suma %d / resta %d / multi %d / div %d",suma, resta, mult,div);
        input.close();
    }
}
