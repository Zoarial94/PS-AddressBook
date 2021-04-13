import java.util.Scanner;

public class MainRunner {
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
        // Variables
        boolean run = true;
        Scanner input = new Scanner(System.in);
        int userChoice;
        AddressBook addressBook = new AddressBook();

        // Setup
        addressBook.addEntry(new AddressEntry("Hunter", "White", "", "0123456789", "HWB94@protonmail.com", "123 Kingston Pk", "Knoxville", "TN",  37919));
        addressBook.addEntry(new AddressEntry("Hunter", "White", "", "0123456789", "HWB94@protonmail.com", "123 Kingston Pk", "Knoxville", "TN",  37919));
        addressBook.addEntry(new AddressEntry("Hunter", "White", "", "0123456789", "HWB94@protonmail.com", "123 Kingston Pk", "Knoxville", "TN",  37919));
        addressBook.addEntry(new AddressEntry("Hunter", "White", "", "0123456789", "HWB94@protonmail.com", "123 Kingston Pk", "Knoxville", "TN",  37919));


        // Loop
        while(run) {
            println(MENU);
            print("Choice: ");
            userChoice = input.nextInt();

            switch(userChoice) {
                case 1:
                    addressBook.print((entry) -> true);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    run = false;
                    break;
                default:
                    println("Invalid Choice!!");
            }

        }


    }
}
