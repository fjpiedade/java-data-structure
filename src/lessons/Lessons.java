package lessons;

public class Lessons {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);
        // try {
        // vetor.addItem("Item 1");
        // vetor.addItem("Item 2");
        // vetor.addItem("Item 3");
        // } catch (Exception e) {
        // // TODO: handle exception
        // e.printStackTrace();
        // }

        // if (vetor.addItem("Item 1")) {
        // System.out.println("Item added successful...");
        // } else {
        // System.out.println("Item not added successful...");
        // }

        // if (vetor.addItem("Item 2")) {
        // System.out.println("Item added successful...");
        // } else {
        // System.out.println("Item not added successful...");
        // }

        // if (vetor.addItem("Item 3")) {
        // System.out.println("Item added successful...");
        // } else {
        // System.out.println("Item not added successful...");
        // }

        vetor.addItem("Item 1");
        vetor.addItem("Item 2");
        vetor.addItem("Item 3");

        // Lesson 4
        System.out.println(vetor.length());

        // Lesson 4
        System.out.println(vetor);

        // Lesson 5
        System.out.println(vetor.search(2));

        // Lesson 6
        System.out.println(vetor.search("Item 2"));
        System.out.println(vetor.search("Item 4"));

        // Lesson 7
        System.out.println(vetor);
        try {
            vetor.addItem(2, "Item A");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(vetor);

        try {
            vetor.addItem(1, "Item B");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(vetor);

        // Lesson 8
        vetor.addItem("Item 6");
        vetor.addItem("Item 7");
        vetor.addItem("Item 8");
        vetor.addItem("Item 9");
        vetor.addItem("Item 10");
        vetor.addItem("Item 11");
        vetor.addItem("Item 12");

        System.out.println(vetor);

        // Lesson 9
        try {
            vetor.deleteItem(1);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(vetor);

        // Lesson 10
        VetorObject vector = new VetorObject(3);
        // vector.addItem(3);
        // vector.addItem(4);
        // vector.addItem(5);
        // System.out.println(vector.length());
        // System.out.println(vector);

        // Lesson 10 using contact Class to create new object
        Contact newContact_1 = new Contact("Phi Joe", "351912000999", "phi.joe@fjpiedade.phi");
        Contact newContact_2 = new Contact("Phi John", "351912000777", "phi.john@fjpiedade.phi");
        Contact newContact_3 = new Contact("John Joe", "351912000888", "john.joe@fjpiedade.phi");

        vector.addItem(newContact_1);
        vector.addItem(newContact_2);
        vector.addItem(newContact_3);

        System.out.println(vector.length());
        System.out.println(vector);

        // Lesson 11 different types
        // vector.addItem(1);
        // vector.addItem("String Item");

        // LLesson 11 allowed only one type of item

        ListGeneric<String> listOfString = new ListGeneric<String>(3);
        listOfString.addItem("1");
        listOfString.addItem("2");
        listOfString.addItem("1");

        // ListGeneric<Contact> listOfContact = new ListGeneric<Contact>(3);
        // listOfContact.addItem(newContact_1);

        System.out.println(listOfString.lastIndexOf("1"));
        try {
            listOfString.deleteItem("2");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(listOfString);

        try {
            System.out.println(listOfString.get(1));
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        listOfString.deleteAllItem();
        System.out.println(listOfString);
    }

}
