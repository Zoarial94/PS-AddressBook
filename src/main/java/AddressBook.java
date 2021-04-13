import java.util.ArrayList;
import java.util.function.Predicate;

public class AddressBook {
      static ArrayList<AddressEntry> entries = new ArrayList<>(); //Arraylist that holds all the entries from AddressEntry


public AddressBook(){

}

public void addContact(AddressEntry entry){
    entries.add(entry);
}

public void removeContact(AddressEntry entry){
    entries.remove(entry);
}

public static void print(Predicate<AddressEntry> predicate) {
    for (AddressEntry entry : entries){
        if(predicate.test(entry)){
            System.out.println(entry);
        }else System.out.println("??");
    }
}




}
