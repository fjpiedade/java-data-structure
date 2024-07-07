package stacks;

import generic.GenericStatic;

// the base concepts -  last in first out

public class Pilha<T> extends GenericStatic<T> {

    public Pilha() {
        super();
    }

    public Pilha(int capacity) {
        super(capacity);
    }

    public void empilha(T item) {
        super.addItem(item);
    }

    public T topo() {
        if (this.isEmpty()) {
            return null;
        }
        return this.items[this.size - 1];
    }

    public T desempilha() {
        if (this.isEmpty()) {
            return null;
        }
        // T item = this.items[this.size - 1];
        // this.size--;
        // return item;
        return this.items[--this.size];
    }

}
