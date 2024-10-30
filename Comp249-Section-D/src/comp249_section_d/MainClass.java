package comp249_section_d;

public class MainClass {

    public static void main(String[] args) {

        System.out.println(sumUpTo(4));

    }

    public static void countDown(int n) {
        // Base case
        if (n == 0) {
            System.out.println(0);
        } // Recursive call
        else {
            System.out.println(n);
            countDown(n - 1);
        }
    }

    public static void countUp(int n) {
        // Base case
        if (n == 0) {
            System.out.println(0);
        } // Recursive call
        else {
            countUp(n - 1);
            System.out.println(n); //
        }
    }

    public static int sumUpTo(int n) {
        // Base case
        if (n == 0) {
            return 0;
        } else {
            // Recursive call
            return n + sumUpTo(n - 1);
        }
    }

    public static int arraySum(int[] array) {
        // Base case

        // Recursive call
    }
}
