import stacks.Pilha;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Lesson 14");

        Pilha<Integer> stack = new Pilha<Integer>();

        for (int i = 1; i <= 10; i++) {
            stack.empilha(i);
            System.out.println("added item = " + i + " successful...");

        }

        System.out.println(stack.toString());
        System.out.println(stack.length());
        System.out.println(stack.topo());
        System.out.println(stack.desempilha());
        System.out.println(stack.toString());
        System.out.println(stack.length());

    }
}
