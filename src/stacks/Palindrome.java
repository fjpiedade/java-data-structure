package stacks;

import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("ADA"));
        System.out.println(palindrome("Maria"));

        System.out.println("Is balenced Expression? : " + balancingExpression("()+{}+[]+A+B"));
        System.out.println("Is balenced Expression? : " + balancingExpression("{+A"));
    }

    public static boolean palindrome(String word) {
        Stack<Character> stackOfWord = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            stackOfWord.push(word.charAt(i));
        }
        StringBuilder invertedWord = new StringBuilder("");

        while (!stackOfWord.isEmpty()) {
            invertedWord.append(stackOfWord.pop());
        }

        if (word.equals(invertedWord.toString())) {
            return true;
        }

        return false;
    }

    final static String OPEN_EXPRESSION = "([{";
    final static String CLOSE_EXPRESSION = ")]}";

    public static boolean balancingExpression(String expression) {
        Stack<Character> stackOfWord = new Stack<>();
        char symbol, top;

        int index = 0;
        while (index < expression.length()) {
            symbol = expression.charAt(index);
            if (OPEN_EXPRESSION.indexOf(symbol) > -1) {
                stackOfWord.push(symbol);
            } else if (CLOSE_EXPRESSION.indexOf(symbol) > -1) {
                if (stackOfWord.isEmpty()) {
                    return false;
                } else {
                    top = stackOfWord.pop();
                    if (OPEN_EXPRESSION.indexOf(top) != CLOSE_EXPRESSION.indexOf(symbol)) {
                        return false;
                    } else {

                    }
                }
            }

            index++;
        }

        return stackOfWord.isEmpty();
    }
}
