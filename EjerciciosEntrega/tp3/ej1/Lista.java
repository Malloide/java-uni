package EjerciciosEntrega.tp3.ej1;

import java.util.Objects;

/**
 * Clase Lista que simula una lista dinámica utilizando un arreglo.
 *
 * @param <E> Tipo de elemento que almacena la lista.
 */
public class Lista<E> {
    private E[] elementos;
    private int size;
    private final int capacity;

    /**
     * Constructor de la clase Lista.
     *
     * @param capacidad Capacidad máxima de la lista.
     */
    @SuppressWarnings("unchecked")
    public Lista(int capacidad) {
        this.capacity = capacidad;
        this.elementos = (E[]) new Object[capacidad];
        this.size = 0;
    }

    /**
     * Agrega un elemento al final de la lista.
     *
     * @param e Elemento a agregar.
     * @throws IndexOutOfBoundsException Si la lista está llena.
     */
    public void add(E e) throws IndexOutOfBoundsException {
        if (size >= capacity) {
            throw new IndexOutOfBoundsException("La lista está llena");
        }
        elementos[size++] = e;
    }

    /**
     * Agrega un elemento en una posición específica de la lista.
     *
     * @param p Índice donde insertar el elemento.
     * @param e Elemento a insertar.
     * @throws IndexOutOfBoundsException Si la posición es inválida o la lista está llena.
     */
    public void add(int p, E e) throws IndexOutOfBoundsException {
        if (p < 0 || p > size || size >= capacity) {
            throw new IndexOutOfBoundsException("Posición inválida o lista llena");
        }
        for (int i = size; i > p; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[p] = e;
        size++;
    }

    /**
     * Retorna el elemento en la posición dada.
     *
     * @param p Índice del elemento a retornar.
     * @return Elemento en la posición p.
     * @throws IndexOutOfBoundsException Si el índice es inválido.
     */
    public E get(int p) throws IndexOutOfBoundsException {
        if (p < 0 || p >= size) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        return elementos[p];
    }

    /**
     * Remueve un elemento de la lista por valor.
     *
     * @param e Elemento a remover.
     * @return El elemento removido, o null si no se encontró.
     */
    public E remove(E e) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(elementos[i], e)) {
                E eliminado = elementos[i];
                for (int j = i; j < size - 1; j++) {
                    elementos[j] = elementos[j + 1];
                }
                elementos[--size] = null;
                return eliminado;
            }
        }
        return null;
    }

    /**
     * Remueve un elemento de la lista por índice.
     *
     * @param p Índice del elemento a remover.
     * @return El elemento removido.
     * @throws IndexOutOfBoundsException Si el índice es inválido.
     */
    public E remove(int p) throws IndexOutOfBoundsException {
        if (p < 0 || p >= size) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        E eliminado = elementos[p];
        for (int i = p; i < size - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        elementos[--size] = null;
        return eliminado;
    }

    /**
     * Devuelve el tamaño actual de la lista.
     *
     * @return Número de elementos almacenados.
     */
    public int size() {
        return size;
    }
}
