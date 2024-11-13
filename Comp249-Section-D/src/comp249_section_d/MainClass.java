package comp249_section_d;

import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) { // Static context

        ArrayList<String> names = new ArrayList<>(20); // int: primitive type | Integer: a class that can hold int value

        names.add("John"); // add at the end
        names.add("Jane");
        names.add("Ali");

        names.add(1, "Michel"); // adds at specified position

        //names.remove("Ali");
        System.out.println(names);

//        for (int i = 0; i < names.size(); i++) {
//            System.out.println(names.get(i));
//        }
    }

}
