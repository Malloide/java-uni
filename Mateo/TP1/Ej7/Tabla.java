package Ej7;

public class Tabla {

    public void tablas() {
        int a = 0;
        while (a <= 10) {
            int b = a;

            int cuadrado = b * b;
            int cubo = b * b * b;

            System.out.printf("%d ", cuadrado);
            System.out.printf("%d\n", cubo);

            a++;
        }
    }
}