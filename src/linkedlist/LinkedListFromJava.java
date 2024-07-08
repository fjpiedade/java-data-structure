package linkedlist;

import java.util.LinkedList;

public class LinkedListFromJava {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.addFirst(2);
        list.addLast(4);

        list.removeFirst();
        list.removeLast();

        list.add(0, 9);
        list.add(8);

        System.out.println(list);
    }
}
