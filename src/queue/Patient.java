package queue;

public class Patient /* implements Comparable<Patient> */ {
    private String name;
    private int priority;

    public Patient() {
    }

    public Patient(String name, int priority) {
        super();
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    /*
     * @Override
     * public int compareTo(Patient patient) {
     * // TODO Auto-generated method stub
     * // throw new
     * UnsupportedOperationException("Unimplemented method 'compareTo'");
     * // how works compar in Java
     * // object1 > object2 return > 0 (1)
     * // object1 < object2 return < 0 (-1)
     * // object1 = object2 return = 0 (0)
     * if (this.priority > patient.getPriority()) {
     * return 1;
     * } else if (this.priority < patient.getPriority()) {
     * return -1;
     * }
     * return 0;
     * }
     */

    @Override
    public String toString() {
        return "Patient [name=" + name + ", priority=" + priority + "]";
    }

}
