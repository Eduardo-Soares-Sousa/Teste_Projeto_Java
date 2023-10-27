package Fila_Package;

public class FilaCircular<T> implements IFila<T>{
    private static final int DEFAULT_SIZE = 5;

    private Object elements[];
    int startPosition, endPosition, size;

    public FilaCircular(int initialSize) {
        if(initialSize < 1){
            initialSize = DEFAULT_SIZE;
        }
        elements = new Object[initialSize];
        startPosition = -1;
        endPosition = -1;
        size = 0;
    }

    @Override
    public T dequeue() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean enqueue(T e) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        return false;
    }

    
    
}
