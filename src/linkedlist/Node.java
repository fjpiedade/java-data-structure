package linkedlist;

public class Node<T> {
    private T item;
    private Node<T> nextItem;

    public Node() {
    }

    public Node(T item) {
        this.item = item;
        this.nextItem = null;
    }

    public Node(T item, Node<T> nextItem) {
        this.item = item;
        this.nextItem = nextItem;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Node<T> getNextItem() {
        return nextItem;
    }

    public void setNextItem(Node<T> nextItem) {
        this.nextItem = nextItem;
    }

    @Override
    public String toString() {
        return "Node [item=" + item + ", nextItem=" + nextItem + "]";
    }

}
