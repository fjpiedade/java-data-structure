package queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueFromJava {
    public static void main(String[] args) {
        Queue<Patient> priorityQueue = new PriorityQueue<>(
                new Comparator<Patient>() {

                    @Override
                    public int compare(Patient o1, Patient o2) {
                        // TODO Auto-generated method stub
                        // throw new UnsupportedOperationException("Unimplemented method 'compare'");
                        return Integer.valueOf(o1.getPriority()).compareTo(o2.getPriority());
                    }

                });

        priorityQueue.add(new Patient("Jon", 3));
        priorityQueue.add(new Patient("Tell", 1));
        priorityQueue.add(new Patient("Phi", 2));
        System.out.println(priorityQueue);

    }
}
