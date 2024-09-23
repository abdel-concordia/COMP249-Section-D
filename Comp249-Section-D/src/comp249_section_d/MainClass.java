package comp249_section_d;

public class MainClass {

    public static void main(String[] args) {

        Address address1 = new Address(50, "St Catherine", "H3G...");
        //Address address2 = new Address(50, "St Catherine", "H3G...");
        //Person person1 = new Person("Peter", -10, address1);
        //System.out.println(person1.toString());

        Student st = new Student("Peter", 10, address1, "123456", 4.0);

        System.out.println(st);

        System.out.println(st.equals(new String("Hello")));

        //Person person2 = new Person(person1);
        //System.out.println("Person 1 address: " + person1.getAddress());
        //System.out.println("Person 2 address: " + person2.getAddress());
        //person1.getAddress().setCivicNumber(300);
        //person1.setName("Julie");
        //System.out.println("After change");
        //System.out.println(person1.getName() + " " + person1.getAddress());
        //System.out.println(person2.getName() + " " + person2.getAddress());
        /*
        MainClass obj = new MainClass();

        /*
        int y = 10;
        obj.f(y);
        System.out.println("Value after calling f: " + y);

        A a1 = new A(7);
        System.out.println("Before calling the method: " + a1.number);
        obj.g(a1);
        System.out.println("After calling the method: " + a1.number);
         */
    }

}
