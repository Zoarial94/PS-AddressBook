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

    private String book = "src/main/java/book";
    public void readFile() {
        int i = 0;
        try (var file = new BufferedReader(new FileReader(this.book))) {
            String entry;
            while ((entry = file.readLine()) != null) {
                System.out.println("Just entered for each loop");
                this.add(new AddressEntry(entry.split(" ")));
                i++;
            }
        } catch (Exception e) {
            System.out.println("Something went wrong while reading file:\n" + e.getMessage());
        } finally {
            System.out.println("read entry number " + i);
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
