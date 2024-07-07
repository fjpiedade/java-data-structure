package queue;

public class UsingFila {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        // FilaWithPriority<Integer> filaWithPriority = new FilaWithPriority<>();
        FilaWithPriority<Patient> filaOfPatient = new FilaWithPriority<>();

        // System.out.println(fila.isEmpty());
        // System.out.println(fila.length());

        // fila.enfileira(1);
        // fila.enfileira(2);
        // fila.enfileira(3);
        // fila.enfileira(4);

        // System.out.println(fila.isEmpty());
        // System.out.println(fila.length());
        // System.out.println(fila.toString());
        // System.out.println(fila.desenfileira());
        // System.out.println(fila.desenfileira());
        // System.out.println(fila.isEmpty());
        // System.out.println(fila.length());
        // System.out.println(fila.toString());

        // filaWithPriority.enfileira(1);
        // filaWithPriority.enfileira(9);
        // filaWithPriority.enfileira(4);
        // filaWithPriority.enfileira(3);

        filaOfPatient.enfileira(new Patient("Phi Joe", 2));
        filaOfPatient.enfileira(new Patient("Phil John", 3));
        filaOfPatient.enfileira(new Patient("Fernan Phi", 1));

        System.out.println(filaOfPatient);
    }

}
