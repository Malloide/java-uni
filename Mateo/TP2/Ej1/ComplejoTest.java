package Mateo.TP2.Ej1;

public class ComplejoTest {

    public static void main() {
        Complejo cuentas = new Complejo(5, 2);

        System.out.println("Suma: " + cuentas.sumar(cuentas));
        System.out.println("Resta: " + cuentas.restar(cuentas));
        System.out.println("Multiplicacion: " + cuentas.multiplicar(cuentas));
        System.out.println("Division: " + cuentas.dividir(cuentas));
        System.out.println("Division escalar: " + cuentas.dividirEscalar(5));
    }
}
