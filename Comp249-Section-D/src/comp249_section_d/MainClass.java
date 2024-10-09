package comp249_section_d;

import java.util.InputMismatchException;

public class MainClass {

    public static void main(String[] args) {
        Address address = new Address(50, "St Catherine", "H3G...");

        try {
            Person person = new Person("John", -15, address);
        } catch (InputMismatchException imex) {
            System.out.println(imex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Thank you for using this program");
        }
    }
}
