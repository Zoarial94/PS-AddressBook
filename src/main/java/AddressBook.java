import java.util.ArrayList;
import java.util.function.Predicate;

public class AddressBook {
      ArrayList<AddressEntry> entries = new ArrayList<>();


public AddressBook(){

}

public void addEntry(AddressEntry entry){
    entries.add(entry);
}
public void print(Predicate<AddressEntry> predicate) {
    for (AddressEntry entry : entries){
        if(predicate.test(entry)){
            System.out.println(entry);
        }
    }

    //(Sort by name, then surname)
}
}
