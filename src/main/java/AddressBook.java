import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class AddressBook extends ArrayList<AddressEntry> {

    public AddressBook() {

    }

    public void print(Predicate<AddressEntry> predicate) {
        for (AddressEntry entry : this) {
            if (predicate.test(entry)) {
                System.out.println(entry);
            }
        }
    }
        public void find(Predicate<AddressEntry> predicate) {
            for (AddressEntry entry : this) {
                if (predicate.test(entry)) {
                    System.out.println(entry);
                }
            }

    }
    //
    public void delete(Predicate<AddressEntry> predicate) {
        for (AddressEntry entry : this) {
            if (predicate.test(entry)) {
                System.out.println(entry);
            }
        }
    }

    //Consumer accepts a single input argument and return no result
    public void edit(String lastName, String firstName, Consumer<AddressEntry> consumer){
        for (AddressEntry entry : this) {
                consumer.accept(entry);
        }
    }
}


