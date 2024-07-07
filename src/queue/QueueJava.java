package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueJava {
    // LinkedList represent the Queue;

    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();

        fila.add(1); // enfileira
        fila.add(2);
        fila.add(3);
        fila.add(9);

        System.out.println(fila);
        fila.remove(); // dequeue
        System.out.println(fila);

        System.out.println(fila.element()); // espiar but generate exception in empty queue
        System.out.println(fila.peek()); // espiar

        System.out.println(fila.poll()); // retrieve the first item and remove it.
        System.out.println(fila);
        System.out.println("size: " + fila.size());

    }

}
