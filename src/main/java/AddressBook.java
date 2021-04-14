import java.util.ArrayList;
import java.util.function.Predicate;

public class AddressBook extends ArrayList<AddressEntry> {

    public AddressBook(){

    }

    public void print(Predicate<AddressEntry> predicate) {
        for (AddressEntry entry : this){
            if(predicate.test(entry)){
                System.out.println(entry);
            }
        }


    }
}

