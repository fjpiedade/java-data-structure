package queue;

public class FilaWithPriority<T> extends Fila<T> {

    @Override
    public void enfileira(T item) {
        Comparable<T> key = (Comparable<T>) item;

        int i;
        for (i = 0; i < this.size; i++) {
            if (key.compareTo(this.items[i]) < 0) {
                break;
            }
        }

        try {
            this.addItem(i, item);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
