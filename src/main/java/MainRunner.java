import java.util.Scanner;

public class MainRunner {
    private static Scanner input = new Scanner(System.in);
    static String EDIT_MENU = "" +
            "1) First Name\n" +
            "2) Last Name\n" +
            "3) Phone Number\n" +
            "4) Mobile Number\n" +
            "5) Email Address\n" +
            "6) Street Address\n" +
            "7) Town\n" +
            "8) State\n" +
            "9) Zip\n" +
            "10) Exit\n";
    static String MENU = "" +
            "1) Print all\n" +
            "2) Add contact\n" +
            "3) Search by name\n" +
            "4) Search by number\n" +
            "5) Edit by name\n" +
            "6) Edit by number\n" +
            "7) Delete by name\n" +
            "8) Delete by number\n" +
            "9) Exit\n";

    static <T> void println(T var) {
        System.out.println(var);
    }
    static <T> void print(T var) {
        System.out.print(var);
    }


    public static void main(String[] args) {
        var addressBook = new AddressBook();
        addressBook.selectFile("src/main/resources/defaultBook");
        addressBook.readFile();

        for (var e : addressBook)
            System.out.println(e.toString());

        //addressBook.writeFile();
        // Variables
        boolean run = true;
        int userChoice;

        while(run) {
            println(MENU);
            userChoice = getUserInteger("Choice: ");
            String fName, lName, number;
            AddressEntry entry;
            boolean b;

            switch(userChoice) {
                case 1:
                    // First sort the collection
                    // Then print everything
                    addressBook.sort((entry1, entry2) -> {
                        int ret = entry1.getFirstName().compareTo(entry2.getFirstName());
                        if (ret == 0) {
                            return entry1.getLastName().compareTo(entry2.getLastName());
                        } else {
                            return ret;
                        }
                    });
                    addressBook.print((e) -> true);
                    break;
                case 2:
                    println("Creating new entry.");
                addressBook.add(new AddressEntry(
                        getUserString("First Name: "),
                        getUserString("Last Name: "),
                        getUserString("Phone Number: "),
                        getUserString("Mobile Number: "),
                        getUserString("Email: "),
                        getUserString("Street Address: "),
                        getUserString("Town: "),
                        getUserString("State: "),
                        getUserString("Zip: ")));
                    break;
                case 3:
                    println("Searching contacts by name.");
                    fName = getUserString("First Name: ");
                    lName = getUserString("Last Name: ");
                    entry = addressBook.find((e) -> (e.getFirstName().equals(fName) && e.getLastName().equals(lName)));
                    if(entry != null) {
                        println(entry);
                    } else {
                        println("No entry found!");
                    }
                    break;
                case 4:
                    println("Searching contacts by number.");
                    number = getUserString("Phone number: ");
                    entry = addressBook.find((e) -> (e.getPhone().equals(number) || e.getMobile().equals(number)));
                    if(entry != null) {
                        println(entry);
                    } else {
                        println("No entry found!");
                    }
                    break;
                case 5:
                    println("Editing contact by name.");
                    fName = getUserString("First Name: ");
                    lName = getUserString("Last Name: ");
                    entry = addressBook.find((e) -> {
                        return (e.getFirstName().equals(fName) && e.getLastName().equals(lName));
                    });
                    if(entry != null) {
                        editEntry(entry);
                    } else {
                        println("No entry found!");
                    }
                    break;
                case 6:
                    println("Editing contact by number.");
                    number = getUserString("Phone number: ");
                    entry = addressBook.find((e) -> {
                        return (e.getPhone().equals(number) || e.getMobile().equals(number));
                    });
                    if(entry != null) {
                        editEntry(entry);
                    } else {
                        println("No entry found!");
                    }
                    break;
                case 7:
                    println("Delete contact by name.");
                    fName = getUserString("First Name: ");
                    lName = getUserString("Last Name: ");
                    b = addressBook.delete((e) -> (e.getFirstName().equals(fName) && e.getLastName().equals(lName)));
                    if(b) {
                        // b is true means it was deleted
                        println("Contact deleted.");
                    } else {
                        println("No contact found!");
                    }

                    break;
                case 8:
                    number = getUserString("Phone number of contact to delete: ");
                    b = addressBook.delete((e) -> e.getPhone().equals(number) || e.getMobile().equals(number));
                    if(b) {
                        // If b is true then contact was deleted.
                        println("Contact was deleted.");
                    } else {
                        println("No contact with that number was found.");
                    }
                    break;
                case 9:
                    run = false;
                    addressBook.writeFile();
                    break;
                default:
                    println("Invalid Choice!!");
            }
        }
    }

    static String getUserString(String out) {
        print(out);
        return input.nextLine().trim();
    }

    static Integer getUserInteger(String out) {
        while(true) {
            String str = getUserString(out);
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException ex) {
                println("Not a number. Try again.");
            }
        }
    }

    static void editEntry(AddressEntry e) {
        boolean run = true;

        while(run) {
            println(EDIT_MENU);
            int choice = getUserInteger("What would you like to edit: ");
            switch (choice) {
                case 1:
                    e.setFirstName(getUserString("First Name: "));
                    break;
                case 2:
                    e.setLastName(getUserString("Last Name: "));
                    break;
                case 3:
                    e.setPhone(getUserString("Phone Number: "));
                    break;
                case 4:
                    e.setMobile(getUserString("Mobile Number: "));
                    break;
                case 5:
                    e.setEmail(getUserString("Email Address: "));
                    break;
                case 6:
                    e.setStreet(getUserString("Street Address: "));
                    break;
                case 7:
                    e.setTown(getUserString("Town: "));
                    break;
                case 8:
                    e.setState(getUserString("State: "));
                    break;
                case 9:
                    e.setZip(getUserString("Zip: "));
                    break;
                case 10:
                    run = false;
                    break;
                default:
                    println("Invalid option!");
            }
        }
    }

}
