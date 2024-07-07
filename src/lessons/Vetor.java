package lessons;

public class Vetor {
    private String[] items;
    private int size;

    public Vetor(int capacity) {
        this.items = new String[capacity];
        this.size = 0;
    }

    // public void addItem(String item) {
    // for (int i = 0; i < items.length; i++) {
    // if (this.items[i] == null) {
    // this.items[i] = item;
    // System.out.println(item + " added successful...");
    // break;
    // }
    // }
    // }

    /*
     * public void addItem(String item) throws Exception {
     * if (this.length < this.items.length) {
     * this.items[this.length] = item;
     * this.length++;
     * } else {
     * throw new
     * Exception("Out of the Length, Not possible add new Item in the Vector");
     * }
     * }
     */

    public boolean addItem(String item) {
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
    public void addItem(int position, String item) throws Exception {
        if (!(position >= 0 && position < this.size)) {
            throw new IllegalAccessException("Position Out of Size");
        }
        // move all items
        for (int i = this.size - 1; i >= position; i--) {
            this.items[i + 1] = this.items[i];
        }
        addMoreCapacity();
        this.items[position] = item;
        this.size++;
    }

    public int length() {
        return this.size;
    }

    // @Override
    // public String toString() {
    // String s = "[";
    // for (int i = 0; i < items.length - 1; i++) {
    // s += this.items[i];
    // s += ", ";
    // }
    // if (this.length > 0) {
    // s += this.items[this.length - 1];
    // }
    // s += "]";

    // return s;
    // }

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

    public String search(int position) {
        if (position >= 0 && position < this.size) {
            return this.items[position];
        } else {
            return ("Position Out of Size");
        }
    }

    public int search(String item) {
        for (int i = 0; i < this.size; i++) {
            if (this.items[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public void addMoreCapacity() {
        if (this.size == this.items.length) {
            String[] newItems = new String[this.items.length * 2];
            for (int i = 0; i < this.items.length; i++) {
                newItems[i] = this.items[i];
            }
            this.items = newItems;
        }
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
}
