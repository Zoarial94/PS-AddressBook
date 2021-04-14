import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.io.*;

public class AddressBook extends ArrayList<AddressEntry> {

    public AddressBook() {

    }
    //For every entry that is true, it is printed out
    public void print(Predicate<AddressEntry> predicate) {
        for (AddressEntry entry : this) {
            if (predicate.test(entry)) {
                System.out.println(entry);
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

    /*
    Program currently reads all values, adds the unique values and appends the file every time it writes,
    unsure how or where to implement a feature to ensure only unique values are read/written
     */
    private String book = "src/main/java/book";
    public void readFile() {
        var f = new File(this.book);
        if (!f.exists()) {
            initFile();
        }

        try (var file = new BufferedReader(new FileReader(book))) {
            String entry;
            while ((entry = file.readLine()) != null) {
                this.add(new AddressEntry(entry.split(",")));
            }
        } catch (IOException e) {
            System.out.println("Something went wrong while reading file:\n" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong with entry.split\n" + e.getMessage());
        }
    }

    public void writeFile() {
        try (var file = new BufferedWriter(new FileWriter(book))) {
            for (var entry : this)
                file.append(entry.toFile());

        } catch (Exception e) {
            System.out.println("Something went wrong while writing file:\n" + e.getMessage());
        }
    }

    public void initFile() {
        try (var file = new BufferedWriter(new FileWriter(book))) {
            file.write("Name,Surname,Phone,Mobile,E-mail,Street,Number,Town,Zip\n");
        } catch (Exception e) {
            System.out.println("Something went wrong while writing file:\n" + e.getMessage());
        }
    }
}


