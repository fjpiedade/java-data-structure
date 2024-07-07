package lessons;
import java.util.ArrayList;

public class Lesson_12 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Item 1");
        arrayList.add("Item 2");
        System.out.println(arrayList);

        arrayList.add(0, "Item 0");
        System.out.println(arrayList);

        System.out.println(arrayList.contains("Item 0"));
        System.out.println(arrayList.size());
        // http://goo.gl/0FheJF

        System.out.println(arrayList.lastIndexOf("Item 0"));
    }
}
