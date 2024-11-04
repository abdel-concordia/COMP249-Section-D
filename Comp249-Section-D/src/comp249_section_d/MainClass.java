package comp249_section_d;

public class MainClass {

    public static void main(String[] args) {

        int[] array = {1, -5, -10, 7};

        System.out.println(sumPositive(array, 0));

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

    public static int arraySum(int[] array, int index) {
        // Base case
        if (index == array.length - 1) // Recursive call
        {
            return array[index];
        } else {
            return array[index] + arraySum(array, index + 1);
        }
    }

    public static int positiveCount(int[] array, int index) {
        // Base a case
        if (index == 0) {
            if (array[index] >= 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            // Recursive call
            if (array[index] >= 0) {
                return 1 + positiveCount(array, index - 1);
            } else {
                return positiveCount(array, index - 1);
            }
        }
    }

    public static int sumPositive(int[] array, int index) {
        // Base case
        if (index == array.length - 1) {
            if (array[index] >= 0) {
                return array[index];
            } else {
                return 0;
            }
        } else {
            // Recursive call
            if (array[index] >= 0) {
                return array[index] + sumPositive(array, index + 1);
            } else {
                return sumPositive(array, index + 1);
            }
        }
    }
}
