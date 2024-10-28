package comp249_section_d;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        // Import text data to a bianry file
        System.out.println("About to read from text file and write to binary file");
        Scanner sc = null;
        ObjectOutputStream mainBinaryFile = null;
        try {
            sc = new Scanner(new FileInputStream("data.txt"));
            mainBinaryFile = new ObjectOutputStream(new FileOutputStream("main.bin"));

            while (sc.hasNextLine()) {
                String id = sc.next();
                String name = sc.next();
                double gpa = sc.nextDouble();

                Student st = new Student(id, name, gpa);

                mainBinaryFile.writeObject(st);
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("Cannot open the file for read!");
            System.exit(0);
        } catch (IOException io) {
            System.out.println("There was a problem writing to the binary file!");
            System.exit(0);
        }

        sc.close();
        try {
            mainBinaryFile.close();
        } catch (IOException ioex) {
            System.out.println("Error closing the binary file!");
        }

        System.out.println("Done writing to the binary file.");

        // SPlit data to 2 binary files
        System.out.println("About to split the binary file to 2 binary files");

        ObjectInputStream mainFile = null;
        ObjectOutputStream file1 = null;
        ObjectOutputStream file2 = null;

        try {
            mainFile = new ObjectInputStream(new FileInputStream("main.bin"));
            file1 = new ObjectOutputStream(new FileOutputStream("file1.bin"));
            file2 = new ObjectOutputStream(new FileOutputStream("file2.bin"));

            // read an object from main
            Student st = (Student) mainFile.readObject();
            // if gpa >= 3, write to file1
            if (st.getGpa() >= 3) {
                file1.writeObject(st);
            } // else, write to file2
            else {
                file2.writeObject(st);
            }
        } catch (FileNotFoundException fnfe) {

        } catch (IOException ioex) {

        }

        System.out.println("Good bye!");
    }

}

class Student implements Serializable {

    private String ID;
    private String name;
    private double gpa;

    public Student(String ID, String name, double gpa) {
        this.ID = ID;
        this.name = name;
        this.gpa = gpa;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

}
