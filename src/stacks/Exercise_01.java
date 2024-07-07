package stacks;

import java.util.Scanner;
import java.util.Stack;

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner readNumber = new Scanner(System.in);
        Stack<Integer> stackOfNumber = new Stack<Integer>();

        int i = 1;
        while (i <= 10) {
            System.out.println("Please enter the number: ");
            int number = readNumber.nextInt();
            if (number % 2 == 0) {
                stackOfNumber.push(number);
            }

            if (number % 2 != 0) {
                if (!stackOfNumber.isEmpty()) {
                    stackOfNumber.peek();
                } else {
                    System.out.println("The Stack is Empty!");
                }
            }

            i++;
        }

        System.out.println("Sow all numbers");
        System.out.println(stackOfNumber);
        for (int j = 0; j < stackOfNumber.size(); j++) {
            stackOfNumber.peek();
        }
        System.out.println("peek all items on the stack");

    }
}
