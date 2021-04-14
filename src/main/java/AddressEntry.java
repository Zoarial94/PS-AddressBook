public class AddressEntry {
    private String firstName;
    private String lastName;
    private String phone;
    private String mobile;
    private String email;
    private String street;
    private int number;
    private String town;
    private String zip;

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

