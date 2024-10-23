package comp249_section_d;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Course comp249 = null;
        boolean done = false;
        while (!done) {
            try {
                Scanner sc = new Scanner(System.in);

                System.out.print("Please input course code: ");
                String code = sc.nextLine();
                System.out.print("Please input course title: ");

                String title = sc.nextLine();
                System.out.print("Please input course CP: ");

                double cp = sc.nextDouble();

                comp249 = new Course(code, title, cp);
                System.out.println(comp249.getCreditPoints());
                done = true;

            } catch (Exception ex) {
                System.out.println("Something bad happened.");
            }
            System.out.println("Good bye.");
        }
    }

}
