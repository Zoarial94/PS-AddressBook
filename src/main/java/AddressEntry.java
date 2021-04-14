import org.jetbrains.annotations.Nullable;

public class AddressEntry {
    //For parsing an array in the constructor
    enum Entry {FIRSTNAME, LASTNAME, PHONE, MOBILE, EMAIL, STREET, TOWN, STATE, ZIP}

    private String firstName;
    private String lastName;
    private String phone;
    private String mobile;
    private String email;
    private String street;
    private String town;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private String state;
    private String zip;

    public AddressEntry(String firstName, String lastName, String phone, String mobile, String email, String street,
                        String town, String state, String zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.mobile = mobile;
        this.email = email;
        this.street = street;
        this.town = town;
        this.zip = zip;
        this.state = state;
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
            entry[Entry.ZIP.ordinal()]);

        //System.out.println("ADDED ENTRY:\n" + this.toString());
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
    public void setFirstName(@Nullable String newFirstName) {
        if (newFirstName == null) return;
        this.firstName = newFirstName.trim();
    }

    // Getter
    public String getLastName() {
        return lastName;
    }

    // Setter
    public void setLastName(@Nullable String newLastName) {
        if (newLastName == null) return;
        this.lastName = newLastName.trim();
    }

    //Getter
    public String getPhone() {
        return phone;
    }

    // Setter
    public void setPhone(String newPhone) {
        if (newPhone == null) return;
        this.phone = newPhone;
    }

    //Getter
    public Object getMobile() {
        return mobile;
    }

    //Setter
    public void setMobile(@Nullable String newMobile) {
        if (newMobile == null) return;
        this.mobile = newMobile;
    }

    //Getter
    public String getEmail() {
        return email;
    }

    //Setter
    public void setEmail(@Nullable String newEmail) {
        if (newEmail == null) return;
        this.email = newEmail;
    }

    //Getter
    public String getStreet() {
        return street;
    }

    //Setter
    public void setStreet(@Nullable String newStreet) {
        if (newStreet == null) return;
        this.street = newStreet;
    }

    //Getter
<<<<<<< HEAD
    public String getNumber() {
        return number;
    }

    //Setter
    public void setNumber(@Nullable String newNumber) {
        if (newNumber == null) return;
        this.number = newNumber;
    }

    //Getter
=======
>>>>>>> origin/develop
    public String getTown() {
        return town;
    }

    public void setTown(@Nullable String newTown) {
        if (newTown == null) return;
        this.town = newTown.trim();
    }
    public String getZip() {
        return zip;
    }

    public void setZip(@Nullable String newZip) {
        if (newZip == null) return;
        this.zip = newZip;
    }

}

