import java.util.ArrayList;
import java.util.function.Predicate;
import java.io.*;

public class AddressBook extends ArrayList<AddressEntry> {

    public AddressBook(){

    }

    public void print(Predicate<AddressEntry> predicate) {
        for (AddressEntry entry : this){
            if(predicate.test(entry)){
                System.out.println(entry);
            }
        }

    //(Sort by name, then surname)
    }

    /*
    Program currently reads all values, adds the unique values and appends the file every time it writes,
    unsure how or where to implement a feature to ensure only unique values are read/written
     */
    private String book = "src/main/java/book";
    public void readFile() {
        try (var file = new BufferedReader(new FileReader(this.book))) {
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
        try (var file = new BufferedWriter(new FileWriter(this.book))) {
            for (var entry : this)
                file.append(entry.toFile());

        } catch (Exception e) {
            System.out.println("Something went wrong while writing file:\n" + e.getMessage());
        }
    }
}
