public class AddressEntry {
    enum Entry {FIRSTNAME, LASTNAME, PHONE, MOBILE, EMAIL, STREET, TOWN, STATE, ZIP}
    private String firstName;
    private String lastName;
    private String phone;
    private String mobile;
    private String email;
    private String street;
    private String town;
    private String state;
    private int zip;

    public AddressEntry(String firstName, String lastName, String phone, String mobile, String email, String street, String town, String state, int zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.mobile = mobile;
        this.email = email;
        this.street = street;
        this.town = town;
        this.state = state;
        this.zip = zip;
    }

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
            Integer.valueOf(entry[Entry.ZIP.ordinal()]));

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
    public String getTown() {
        return town;
    }

    public void setTown(String newTown) {
        this.town = newTown;
    }
    public int getZip() {
        return zip;
    }

    public void setZip(int newZip) {
        this.zip = newZip;

    }

}

