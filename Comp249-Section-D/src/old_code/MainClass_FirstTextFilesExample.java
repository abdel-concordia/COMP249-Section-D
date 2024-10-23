package old_code;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainClass_FirstTextFilesExample {

    public static void main(String[] args) {

        /*
        // Write
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileOutputStream("file.txt"));
        } catch (FileNotFoundException ex) {
            System.out.println("File not found and cannot be created.");
            System.exit(0);
        }

        printWriter.println("Hello 1"); // "\r\n"
        printWriter.println("Hello 2");
        printWriter.println("Hello 3");
        printWriter.println("Hello 4");

        printWriter.close();

         */
        // Read
        Scanner sc = null;
        try {
            sc = new Scanner(new FileInputStream("file.txt"));
        } catch (FileNotFoundException fnfe) {
            System.out.println("Input file not found.");
            System.exit(0);
        }

        while (sc.hasNextInt()) {
            String s = sc.nextLine();
            System.out.println(s);
        }

        sc.close();
    }
}
