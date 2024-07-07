package stacks;

import java.util.Stack;

public class Exercise_08 {
    public static void main(String[] args) {
        Stack<Integer> original = new Stack<>();
        Stack<Integer> destination = new Stack<>();
        Stack<Integer> auxiliary = new Stack<>();

        original.push(3);
        original.push(2);
        original.push(1);

        System.out.println("------");
        System.out.println("Original start: " + original);
        hanoiTowers(original.size(), original, destination, auxiliary);

    }

    public static void hanoiTowers(
            int numberItems,
            Stack<Integer> original,
            Stack<Integer> destination,
            Stack<Integer> auxiliary) {
        if (numberItems > 0) {
            {
                hanoiTowers(numberItems - 1, original, auxiliary, destination);
                destination.push(original.pop());
                System.out.println("------");
                System.out.println("Original: " + original);
                System.out.println("Destination: " + destination);
                System.out.println("Auxiliary: " + auxiliary);
                hanoiTowers(numberItems - 1, auxiliary, destination, original);
            }

        }
    }
}
