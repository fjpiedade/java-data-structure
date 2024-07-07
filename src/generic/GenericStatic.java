package generic;

public class GenericStatic<T> {
    protected T[] items;
    protected int size;

    @SuppressWarnings("unchecked")
    public GenericStatic(int capacity) {
        this.items = (T[]) new Object[capacity];
        this.size = 0;
    }

    public GenericStatic() {
        this(10);
    }

    public GenericStatic(T[] items, int size) {
        this.items = items;
        this.size = size;
    }

    public T[] getItems() {
        return items;
    }

    public void setItems(T[] items) {
        this.items = items;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @SuppressWarnings("unchecked")
    protected void addMoreCapacity() {
        if (this.size == this.items.length) {
            T[] newItems = ((T[]) new Object[this.items.length * 2]);
            for (int i = 0; i < this.items.length; i++) {
                newItems[i] = this.items[i];
            }
            this.items = newItems;
        }
    }

    protected boolean addItem(T item) {
        addMoreCapacity();
        if (this.size < this.items.length) {
            this.items[this.size] = item;
            this.size++;
            return true;
        } else {
            return false;
        }
    }

    // Lesson 7
    protected void addItem(int position, T item) throws Exception {
        if (position < 0 || position > this.size) {
            throw new IllegalAccessException("Position Out of Size");
        }

        addMoreCapacity();

        // move all items
        for (int i = this.size - 1; i >= position; i--) {
            this.items[i + 1] = this.items[i];
        }
        this.items[position] = item;
        this.size++;
    }

    public int length() {
        return this.size;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.size - 1; i++) {
            s.append(this.items[i]);
            s.append(", ");
        }
        if (this.size > 0) {
            s.append(this.items[this.size - 1]);
        }
        s.append("]");

        return s.toString();
    }

    public Object searchWithPosition(int position) {
        if (position >= 0 && position < this.size) {
            return this.items[position];
        } else {
            return ("Position Out of Size");
        }
    }

    public int searchWithItem(T item) {
        for (int i = 0; i < this.size; i++) {
            if (this.items[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public void deleteItem(int position) throws Exception {
        if (!(position >= 0 && position < this.size)) {
            throw new IllegalAccessException("Position Out of Size");
        }
        for (int i = position; i < this.size - 1; i++) {
            this.items[i] = this.items[i + 1];
        }
        this.size--;
    }

    public boolean isEmpty() {
        if (this.size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean contains(T item) {
        return searchWithItem(item) > -1;
    }

    public int lastIndexOf(T item) {
        int lastIndex = -1;
        for (int i = this.items.length - 1; i >= 0; i--) {
            if (this.items[i].equals(item)) {
                lastIndex = i;
                break;
            }
        }
        return lastIndex;
    }

    public void deleteItem(T item) throws Exception {
        int pos = searchWithItem(item);
        if (pos > -1) {
            deleteItem(pos);
        }
    }

    public T get(int position) throws IllegalAccessException {
        if (!(position >= 0 && position < this.size)) {
            throw new IllegalAccessException("Position Out of Size");
        }
        return this.items[position];
    }

    public void deleteAllItem() {
        for (int i = 0; i < this.size - 1; i++) {
            this.items = null;
        }
        this.size = 0;
    }

}
