package comp249_section_d;

import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) { // Static context

        CircularLinkedList1<Integer> iList = new CircularLinkedList1();

        iList.addAtHead(30);

        iList.addAtHead(20);
        iList.addAtHead(10);
        iList.addAtHead(5);
        iList.displayElements();

        CircularLinkedList1<String> sList = new CircularLinkedList1<>();

        sList.addAtHead("Hi");

    }

}
