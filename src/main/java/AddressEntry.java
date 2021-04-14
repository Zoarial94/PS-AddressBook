public class AddressEntry {
    //For parsing an array in the constructor
    enum Entry {FIRSTNAME, LASTNAME, PHONE, MOBILE, EMAIL, STREET, TOWN, STATE, ZIP}

    private String firstName;
    private String lastName;
    private String phone;
    private String mobile;
    private String email;
    private String street;
    private int number;
    private String town;
<<<<<<< HEAD
    private String state;
    private String zip;
=======
    private int zip;
>>>>>>> origin/jessbranch

    public AddressEntry(String firstName, String lastName, String phone, String mobile, String email, String street, int number, String town, int zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.mobile = mobile;
        this.email = email;
        this.street = street;
        this.number = number;
        this.town = town;
        this.zip = zip;
    }
<<<<<<< HEAD

    public AddressEntry(String[] entry) {
        //would be really nice if one could use c style enums
        this(
            entry[Entry.FIRSTNAME.ordinal()],
            entry[Entry.LASTNAME.ordinal()],
            entry[Entry.PHONE.ordinal()],
            entry[Entry.MOBILE.ordinal()],
            entry[Entry.EMAIL.ordinal()],
            entry[Entry.STREET.ordinal()],
            entry[Entry.TOWN.ordinal()],
            entry[Entry.STATE.ordinal()],
            entry[Entry.ZIP.ordinal()]);

        System.out.println("ADDED ENTRY:\n" + this.toString());
    }

    public String toFile() {
        return
            firstName + "," +
            lastName + "," +
                phone + "," +
                mobile + "," +
                email + "," +
                street + "," +
                town + "," +
                state + "," +
                zip + "\n";
    }

    @Override
    public String toString() {
        return "AddressEntry{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", street='" + street + '\'' +
                ", town='" + town + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                '}';
    }

=======
>>>>>>> origin/jessbranch
    // Getter
    public String getFirstName() {
        return firstName;
    }

    // Setter
    public void setFirstName(String newName) {
        this.firstName = newName;
    }

    // Getter
    public String getLastName() {
        return lastName;
    }

    // Setter
    public void setLastName(String newName) {
        this.lastName = newName;
    }

    //Getter
    public String getPhone() {
        return phone;
    }

    // Setter
    public void setPhone(String newPhone) {
        this.phone = newPhone;
    }

    //Getter
    public Object getMobile() {
        return mobile;
    }

    //Setter
    public void setMobile(String newMobile) {
        this.mobile = newMobile;
    }

    //Getter
    public String getEmail() {
        return email;
    }

    //Setter
    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    //Getter
    public String getStreet() {
        return street;
    }

    //Setter
    public void setStreet(String newStreet) {
        this.street = newStreet;
    }

    //Getter
    public int getNumber() {
        return number;
    }

    //Setter
    public void setNumber(int newNumber) {
        this.number = newNumber;
    }

    //Getter
    public String getTown() {
        return town;
    }

    public void setTown(String newTown) {
        this.town = newTown;
    }
    public String getZip() {
        return zip;
    }

    public void setZip(String newZip) {
        this.zip = newZip;
    }

}

