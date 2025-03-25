import java.util.Scanner;

public class Addition {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        double number1;
        double number2;
        double sum;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.printf("Sum is %f\n", sum);

        input.close();
    }

}
