package old_code;

public class Address {

    // Civic number
    private int civicNumber;
    // Street name
    private String streetName;
    // Postal code
    private String postalCode;

    // COnstructors
    // Parametrized constructor
    public Address(int civicNumber, String streetName, String postalCode) {
        this.civicNumber = civicNumber;
        this.streetName = streetName;
        this.postalCode = postalCode;
    }

    public Address(int civicNumber) {
        this(civicNumber, "Unknown street name", "Unknown postal code");
    }

    public Address() {
        this(0, "Unknown street name", "Unknown postal code");
    }

    // Copy constructor
    public Address(Address address) {
        this.civicNumber = address.getCivicNumber();
        this.streetName = address.streetName;
        this.postalCode = address.postalCode;
    }

    // Getters
    public int getCivicNumber() {
        return this.civicNumber;
    }

    public String getStreetName() {
        return this.streetName;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    // Setters
    public void setCivicNumber(int civicNumber) {
        this.civicNumber = civicNumber;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String toString() {
        return this.civicNumber + " " + this.streetName + " " + this.postalCode;
    }
}
