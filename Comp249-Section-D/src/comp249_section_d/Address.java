package comp249_section_d;

public class Address {

    // Civic number
    private int civicNumber;
    // Street name
    private String streetName;
    // Postal code
    private String postalCode;

    public Address(int civicNumber, String streetName, String postalCode) {
        this.civicNumber = civicNumber;
        this.streetName = streetName;
        this.postalCode = postalCode;
    }

    public Address() {
        // DO initialization
    }
}
