package stacks;

import java.util.Stack;

public class Exercise_07 {
    // base division is 2, validate the rest 0 multiple or 1 not divisible.
    // push rest of division the number inserted
    // pop the all items to string

    public static void main(String[] args) {
        System.out.println(convertDecimalNumberToBinaryUsingStack(25));
        System.out.println(convertDecimalNumberToBinaryUsingStack(10));
    }

    public static String convertDecimalNumberToBinaryUsingStack(int decimalNumber) {
        int rest = 0;
        Stack<Integer> stack = new Stack<>();
        String binaryNumberString = "";

        while (decimalNumber > 0) {
            rest = decimalNumber % 2;
            stack.push(rest); // empilha
            decimalNumber /= 2;
        }

        while (!stack.isEmpty()) {
            binaryNumberString += stack.pop(); // desempilha
        }

        return binaryNumberString;
    }

}
