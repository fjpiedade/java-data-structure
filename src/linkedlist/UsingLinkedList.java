package linkedlist;

public class UsingLinkedList {
    public static void main(String[] args) {
        ListaEncadeada<Integer> list = new ListaEncadeada<Integer>();
        list.addNodeAtEnd(1);
        list.addNodeAtEnd(2);
        list.addNodeAtEnd(3);
        list.addNodeAtBegin(4);
        list.addNode(1, 5);
        System.out.println(list);
        System.out.println("Length of List: " + list.getLength());

        System.out.println(list.searchByItem(1));
        System.out.println(list.searchItem(1));

        System.out.println(list.deleteFirstNode());
        System.out.println(list);
        System.out.println(list.deleteFirstNode());
        System.out.println(list);
        System.out.println("Length of List: " + list.getLength());

        System.out.println(list.deleteLastNode());
        System.out.println(list);
        System.out.println("Length of List: " + list.getLength());

        System.out.println(list.deleteNode(0));
        // System.out.println(list.deleteNode(4));
        System.out.println(list);
        System.out.println("Length of List: " + list.getLength());

        System.out.println(list.deleteNode(0));
        // System.out.println(list.deleteNode(4));
        System.out.println(list);
        System.out.println("Length of List: " + list.getLength());

        list.clearList();
        System.out.println(list);
        System.out.println("Length of List: " + list.getLength());

        // System.out.println(list.deleteLastNode());
    }
}
