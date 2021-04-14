import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class AddressBook extends ArrayList<AddressEntry> {

    public AddressBook() {

    }
    //For every entry that is true, it is printed out
    public void print(Predicate<AddressEntry> predicate) {
        for (AddressEntry entry : this) {
            if (predicate.test(entry)) {
                 /* It was giving me location of values, so I used String.join,
                    not sure if there's a better way convert and display all values,
                    I just chose first name, last name, and mobile for now.
                     */
                System.out.println(String.join("  ", entry.getFirstName(), entry.getLastName(),
                                              (CharSequence) entry.getMobile())); //needed to cast Object
            }
        }
    }
    //If input argument matches (true) then entry is found, otherwise entry not found
        public void find(Predicate<AddressEntry> predicate) {
            for (AddressEntry entry : this) {
                if (predicate.test(entry)) {
                    //It should return information matching the name/number that was input in
                    System.out.println(entry);
                }
            }

    }
    //If input argument matches (true) then entry gets selected for deletion
    public void delete(Predicate<AddressEntry> predicate) {
        for (AddressEntry entry : this) {
            if (predicate.test(entry)) {
                remove(entry);
            }
        }
    }

    /* Consumer accepts a single input argument and return no result
        NOTE: May remove this and just use find() and modify to edit entries
     */
    public void edit(String lastName, String firstName, Consumer<AddressEntry> consumer){
        for (AddressEntry entry : this) {
                consumer.accept(entry);
        }
    }
}


