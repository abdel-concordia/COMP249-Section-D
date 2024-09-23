package comp249_section_d;

public class Person extends Object {

    // Name: String
    protected String name;
    // Age: int
    private int age;
    // Address: String
    private Address address;

    // (Fully)Parametrize constructor
    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address; // Shallow copy
        System.out.println("Main constructor called.");
    }

    // Default constructor
    public Person() {
        this("Unknown name", 0, new Address());
        System.out.println("Default constructor called");
    }

    // Copy constructor
    public Person(Person otherPerson) {
        this(otherPerson.name, otherPerson.age, new Address(otherPerson.address)); // With a Deep Copy
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public Address getAddress() {
        return this.address;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "this is " + this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Person other = (Person) obj;

        return this.age == other.age;

    }

    public final void f() {

    }

    void g() {

    }

}
