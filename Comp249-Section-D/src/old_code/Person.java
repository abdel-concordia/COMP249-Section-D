package old_code;

import java.util.InputMismatchException;

public class Person extends Object {

    // Name: String
    protected String name;
    // Age: int
    private int age;
    // Address: String
    private Address address;

    // (Fully)Parametrize constructor
    public Person(String name, int age, Address address) throws InputMismatchException, NullPointerException {
        this.name = name;
        if (age < 0) {
            InputMismatchException exceptionObject = new InputMismatchException("Age must be positive!");
            throw exceptionObject;
        }
        this.age = age;
        this.address = address; // Shallow copy
        System.out.println("Main constructor called.");
    }

    // Default constructor
    public Person() throws Exception {
        this("Unknown name", 0, new Address());
        System.out.println("Default constructor called");
    }

    // Copy constructor
    public Person(Person otherPerson) throws Exception {
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

    public void f() {
        System.out.println("THis is method f in Person");
    }

}
