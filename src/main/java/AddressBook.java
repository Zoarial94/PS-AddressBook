import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.io.*;
import java.util.*;

// AddressBook extends ArrayList so that functions such as Collections.sort() work natively.
public class AddressBook extends ArrayList<AddressEntry> {
    private String rolodex;
    private String csvHead;

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
        public AddressEntry find(Predicate<AddressEntry> predicate) {
            for (AddressEntry entry : this) {
                if (predicate.test(entry)) {
                    //It should return information matching the name/number that was input in
                    return entry;
                }
            }
            return null;
    }
    //If input argument matches (true) then entry gets selected for deletion
    public boolean delete(Predicate<AddressEntry> predicate) {
        for (AddressEntry entry : this) {
            if (predicate.test(entry)) {
                remove(entry);
                return true;
            }
        }
        return false;
    }

    /*
    Program currently reads all values, adds the unique values and appends the file every time it writes,
    unsure how or where to implement a feature to ensure only unique values are read/written
     */
    public void loadAddressBook() {
        System.out.println("Load AddressBook? (Y/N)");
        var input = new Scanner(System.in);
        String selection;
        while (true) {
            selection = input.next();
            if (selection.toLowerCase().compareTo("y") == 0 || selection.toLowerCase().compareTo("yes") == 0) {
                System.out.println("Enter Address Book path:");
                selectFile(input.next());
                break;
            } else if (selection.toLowerCase().compareTo("n") == 0 || selection.toLowerCase().compareTo("no") == 0) {
                System.out.println("Default book selected");
                selectFile("src/main/resources/defaultBook");
                break;
            } else {
                System.out.println("Sorry, " + selection + " isn't valid");
                continue;
            }
        }
        readFile();
    }

    public void selectFile(String filepath) {
        rolodex = filepath;
    }

    public void readFile() {
        var f = new File(rolodex);
        if (!f.exists()) {
            initFile();
        }

        try (var file = new BufferedReader(new FileReader(rolodex))) {
            String entry;
            csvHead = file.readLine(); //pulls the format before adding entrys
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
        try (var file = new BufferedWriter(new FileWriter(rolodex))) {
            file.append(csvHead + '\n'); //inserts the format before adding entrys
            for (var entry : this)
                file.append(entry.toFile());

        } catch (Exception e) {
            System.out.println("Something went wrong while writing file:\n" + e.getMessage());
        }
    }

    public void initFile() {
        try (var file = new BufferedWriter(new FileWriter(rolodex))) {
            file.write("Name,Surname,Phone,Mobile,E-mail,Street,Number,Town,Zip\n");
        } catch (Exception e) {
            System.out.println("Something went wrong while writing file:\n" + e.getMessage());
        }
    }
}


