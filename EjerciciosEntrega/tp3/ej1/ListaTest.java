package EjerciciosEntrega.tp3.ej1;
/**
 * Clase de prueba para la clase Lista.
 */
public class ListaTest {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(5);

        System.out.println("Probando add(E e)...");
        lista.add("A");
        lista.add("B");
        lista.add("C");
        imprimir(lista);

        System.out.println("Probando add(int p, E e)...");
        lista.add(1, "X");
        imprimir(lista);

        System.out.println("Probando get(int p)...");
        System.out.println("Elemento en posición 2: " + lista.get(2));

        System.out.println("Probando remove(E e)...");
        lista.remove("B");
        imprimir(lista);

        System.out.println("Probando remove(int p)...");
        lista.remove(0);
        imprimir(lista);

        System.out.println("Probando excepciones...");
        try {
            lista.get(100);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Excepción esperada: " + ex.getMessage());
        }

        try {
            lista.add("Y");
            lista.add("Z");
            lista.add("W"); // Esto debería lanzar excepción (lista llena)
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Excepción esperada: " + ex.getMessage());
        }
    }

    private static void imprimir(Lista<?> lista) {
        System.out.print("Lista: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }
        System.out.println();
    }
}
