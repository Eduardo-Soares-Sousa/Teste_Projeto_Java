package Fila_Package;

/**
 * IFila
 */
public interface IFila<T> {

    boolean enqueue(T e);

    T dequeue();

    boolean isEmpty();

    boolean isFull();
    
}