package comp249_section_d;

import java.util.Scanner;
import java.io.FileInputStream;

import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class MainClass {

    public static void main(String[] args) {

        Scanner inputStrem = null;
        PrintWriter outputStream1 = null;
        PrintWriter outputStream2 = null;

        try {
            inputStrem = new Scanner(new FileInputStream("data.txt"));
            outputStream1 = new PrintWriter(new FileOutputStream("file1.txt"));
            outputStream2 = new PrintWriter(new FileOutputStream("file2.txt"));

            while () {
                // read from datat.txt
                // if gpa >= 3, write to file1.txt
                // else write to file2.txt
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("Cannot open file.");
            System.exit(1);
        }

    }

}
