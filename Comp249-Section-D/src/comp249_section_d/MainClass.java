package comp249_section_d;

public class MainClass {

    public static void main(String[] args) {

        Student2 s1 = new Student2(3.4);
        Student2 s2 = new Student2(4.0);

        s1.equals(s2); // gives true

        String str = new String("Hello");

        s1.compareTo(str); // 0
    }

}
