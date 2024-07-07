package queue;

import generic.GenericStatic;

//FIFO - First In First Out

public class Fila<T> extends GenericStatic<T> {
    // private T[] items;
    // private int size;

    public Fila() {
        super();
    }

    public Fila(int capacity) {
        super(capacity);
    }

    public void enfileira(T item) {
        // this.items[this.size] = item;
        // this.size++;

        this.addItem(item);
    }

    // public void addingCapacity() {

    // }

    // public boolean isEmpty() {
    // return true;
    // }

    public T espiar() {
        if (!this.isEmpty()) {
            return this.items[0];
        }
        return null;
    }

    public T desenfileira() {
        if (this.isEmpty()) {
            return null;
        }

        T itemToRemove = this.items[0];
        try {
            this.deleteItem(0);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return itemToRemove;
    }

    // public int lengthOfTheFila() {
    // return 1;
    // }

    // public String toString() {
    // return "";
    // }

}
