package old_code;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainClass_StudentTextFileExample {

    public static void main(String[] args) {

        Scanner inputStrem = null;
        PrintWriter outputStream1 = null;
        PrintWriter outputStream2 = null;

        try {
            inputStrem = new Scanner(new FileInputStream("data.txt"));
            outputStream1 = new PrintWriter(new FileOutputStream("file1.txt"));
            outputStream2 = new PrintWriter(new FileOutputStream("file2.txt"));

            //while () {
            // read from datat.txt
            // if gpa >= 3, write to file1.txt
            // else write to file2.txt
            //}
        } catch (FileNotFoundException fnfe) {
            System.out.println("Cannot open file.");
            System.exit(1);
        }

    }
}