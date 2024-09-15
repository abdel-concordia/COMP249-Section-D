package comp249_section_d;

public class MainClass {

    public static void main(String[] args) {
        Person person1 = new Person("Peter", -10, new Address());
        //Person person2 = new Person();

        person1.setName("Ali");
        System.out.println(person1.f(7.0));
    }

}
