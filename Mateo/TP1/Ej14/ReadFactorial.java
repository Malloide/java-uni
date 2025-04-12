package Ej14;

public class ReadFactorial {
    public long factorial(int A) {
        int n = A;

        if (n < 0) {
            System.out.println("Numero invalido");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
