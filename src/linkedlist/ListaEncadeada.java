package linkedlist;

public class ListaEncadeada<T> {
    private Node<T> startNode;
    private Node<T> lastNode;
    private int size = 0;

    private final int ITEM_NOT_FOUNDED = -1;
    private final String INVALID_POSITION = "Position isn't Valid!";

    public void addNodeAtBegin(T item) {
        if (this.size == 0) {
            Node<T> newNode = new Node<T>(item);
            this.startNode = newNode;
            this.lastNode = newNode;
        } else {
            Node<T> newNode = new Node<T>(item, this.startNode);
            this.startNode = newNode;
        }

        this.size++;
    }

    public void addNodeAtEnd(T item) {
        Node<T> cell = new Node<T>(item);
        if (this.size == 0) {
            this.startNode = cell;
        } else {
            this.lastNode.setNextItem(cell);
        }
        this.lastNode = cell;
        this.size++;
    }

    public void addNode(int position, T item) {

        if (position > this.size) {
            throw new IllegalArgumentException("Position isn't Valid!");
        } else if (position == this.getLength()) {
            addNodeAtEnd(item);
        } else if (position == 0) {
            this.addNodeAtBegin(item);
        } else {
            Node<T> previewsNode = this.searchItemByPosition(position - 1);
            Node<T> nextNode = previewsNode.getNextItem();
            Node<T> newNode = new Node<T>(item);
            newNode.setNextItem(nextNode);
            previewsNode.setNextItem(newNode);
            this.size++;
        }
    }

    public int getLength() {
        return this.size;
    }

    public void clearList() {

        for (Node<T> currentNode = this.startNode; currentNode != null;) {
            Node<T> nextItem = currentNode.getNextItem();
            currentNode.setItem(null);
            currentNode.setNextItem(null);
            currentNode = nextItem;
        }
        this.startNode = null;
        this.lastNode = null;
        this.size = 0;
    }

    public Node<T> searchItemByPosition(int position) {
        if (!(position >= 0 && position <= this.size)) {
            throw new IllegalArgumentException("Position not exist!");
        }

        Node<T> currentNode = this.startNode;
        for (int i = 0; i < position; i++) {
            currentNode = currentNode.getNextItem();
        }
        return currentNode;
    }

    public T searchItem(int position) {
        return this.searchItemByPosition(position).getItem();
    }

    public int searchByItem(T item) {
        Node<T> currentNode = this.startNode;
        int position = 0;

        while (currentNode != null) {
            if (currentNode.getItem().equals(item)) {
                return position;
            }
            position++;
            currentNode = currentNode.getNextItem();
        }
        return ITEM_NOT_FOUNDED;
    }

    public T deleteFirstNode() {
        if (this.size == 0) {
            throw new RuntimeException("The List is Empty");
        }

        T deletedNode = this.startNode.getItem();
        this.startNode = this.startNode.getNextItem();
        this.size--;
        if (this.size == 0) {
            this.lastNode = null;
        }
        return deletedNode;
    }

    public T deleteLastNode() {
        if (this.size == 0) {
            throw new RuntimeException("The List is Empty");
        }

        if (this.size == 1) {
            return this.deleteFirstNode();
        }

        Node<T> penultimateNode = searchItemByPosition(this.size - 2);

        T deletedNode = penultimateNode.getNextItem().getItem();
        penultimateNode.setNextItem(null);
        this.lastNode = penultimateNode;
        this.size--;

        return deletedNode;
    }

    public T deleteNode(int position) {

        if (isExistPosition(position)) {
            throw new IllegalArgumentException(INVALID_POSITION);
        }

        if (position == 0) {
            return deleteFirstNode();
        }

        if (position == this.size - 1) {
            return deleteLastNode();
        }

        Node<T> previewsNode = this.searchItemByPosition(position - 1);
        Node<T> currentNode = previewsNode.getNextItem();
        previewsNode.setNextItem(currentNode.getNextItem());
        currentNode.setNextItem(null);
        this.size--;
        return currentNode.getItem();
    }

    public boolean isExistPosition(int position) {
        return !(position >= 0 && position < this.size);
    }

    @Override
    public String toString() {

        if (this.size == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        Node<T> currentNode = this.startNode;

        // builder.append(currentNode.getItem()).append(",");

        // while (currentNode.getNextItem() != null) {
        // currentNode = currentNode.getNextItem();
        // builder.append(currentNode.getItem()).append(",");
        // }

        for (int i = 0; i < this.size - 1; i++) {
            builder.append(currentNode.getItem()).append(",");
            currentNode = currentNode.getNextItem();
        }

        // builder.append("]");
        builder.append(currentNode.getItem()).append("]");
        return builder.toString();
    }

}
