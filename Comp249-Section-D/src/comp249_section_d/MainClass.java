package comp249_section_d;

public class MainClass {

    public static void main(String[] args) { // Static context

        CircularLinkedList1 cList = new CircularLinkedList1();

        cList.addAtHead(30);
        cList.addAtHead(20);
        cList.addAtHead(10);
        cList.addAtHead(5);
        cList.displayElements();

    }

}
