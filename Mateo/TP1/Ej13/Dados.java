package Ej13;

import java.util.Random;
import java.util.Scanner;

public class Dados {

    private Random randomNumbers = new Random();

    public void Lanzamiento() {
        Scanner input = new Scanner(System.in);

        System.out.print("Cuantas veces quiere tirar los dados?: ");
        int veces = input.nextInt();

        System.out.println("D1  D2");

        for (int i = 0; i < veces; i++) {
            int dice1 = randomNumbers.nextInt(6);
            int dice2 = randomNumbers.nextInt(6);

            System.out.print(dice1 + "   ");
            System.out.println(dice2);
        }
        input.close();
    }
}
