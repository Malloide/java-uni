package Ej15;

public class CalculateE {

    // Método para calcular el factorial de un número
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Método para calcular el valor de e
    public static double calculateE(int terms) {
        double e = 1.0; // Comienza con el primer término de la serie (1)
        for (int i = 1; i < terms; i++) {
            e += 1.0 / factorial(i); // Suma 1/n! a e
        }
        return e;
    }

    public static void main(String[] args) {
        int terms = 30; // Número de términos a calcular en la serie
        double e = calculateE(terms);
        System.out.println("El valor aproximado de e con " + terms + " términos es: " + e);
    }
}