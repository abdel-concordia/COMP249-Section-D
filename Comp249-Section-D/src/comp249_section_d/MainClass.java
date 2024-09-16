package comp249_section_d;

public class MainClass {

    public static void main(String[] args) {

        Address address1 = new Address(50, "St Catherine", "H3G...");
        //Address address2 = new Address(50, "St Catherine", "H3G...");

        Person person1 = new Person("Peter", -10, address1);

        Person person2 = new Person(person1);

        System.out.println("Person 1 address: " + person1.getAddress());
        System.out.println("Person 2 address: " + person2.getAddress());

        person1.getAddress().setCivicNumber(300);
        person1.setName("Julie");
        System.out.println("After change");

        System.out.println(person1.getName() + " " + person1.getAddress());
        System.out.println(person2.getName() + " " + person2.getAddress());

    }

    // String is immutable
}
