package lessons;
import java.util.ArrayList;

public class Exercise_07 {
    static ArrayList<Contact> listOfContacts = new ArrayList<Contact>();

    public static String newContact(Contact contact) {
        listOfContacts.add(contact);
        return "New Contact " + contact.getName() + " added successful!";
    }

    public static void main(String[] args) {

        Contact newContact_1 = new Contact("Phi Joe", "351912000999", "phi.joe@fjpiedade.phi");
        Contact newContact_2 = new Contact("Phi John", "351912000777", "phi.john@fjpiedade.phi");
        Contact newContact_3 = new Contact("John Joe", "351912000888", "john.joe@fjpiedade.phi");

        System.out.println(newContact(newContact_1));
        System.out.println(newContact(newContact_2));
        System.out.println(newContact(newContact_3));

    }
}
