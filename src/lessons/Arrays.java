package lessons;

public class Arrays {
    public static void main(String[] args) {
        double[] temperatures = new double[365];
        temperatures[0] = 30.1;
        temperatures[1] = 31.1;
        temperatures[2] = 32.1;
        temperatures[3] = 29.1;

        // for (int i = 0; i < temperatures.length; i++) {
        // System.out.println(temperatures[i]);
        // }

        for (double temp : temperatures) {
            System.out.println(temp);
        }

    }
}