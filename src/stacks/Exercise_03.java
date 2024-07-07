package stacks;

import java.util.Stack;

public class Exercise_03 {
    public static void main(String[] args) {
        Stack<Book> listOfBooks = new Stack<>();

        Book book = new Book("Book_01", "122LA09", 2024);

        listOfBooks.push(book);
        // System.out.println(listOfBooks);
        // System.out.println(listOfBooks.push(book););
        System.out.println(listOfBooks.peek());
        System.out.println(listOfBooks.isEmpty());
        System.out.println(listOfBooks.pop());
        System.out.println(listOfBooks.isEmpty());
    }
}
