package Test1;

import java.util.Scanner;

public class Test2 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Test sum = new Test();

        System.out.print("Ingrese el primer numero: ");
        int A = input.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int B = input.nextInt();

        int resultado = sum.suma(A, B);

        System.out.printf("El resultado es %d.\n", resultado);
        input.close();
    }
}
