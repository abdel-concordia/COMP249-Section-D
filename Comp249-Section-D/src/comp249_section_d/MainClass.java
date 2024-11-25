package comp249_section_d;

public class MainClass {

    public static void main(String[] args) { // Static context

        DoublyLinkedList1 dll = new DoublyLinkedList1();

        //dll.addAtHead(5);
        dll.addAtTail(5);
        //dll.addAtTail(70);
        //dll.addAtHead(10);
        dll.addAfter(10, 5);
        dll.displayFromHeadToTail();
        //dll.displayFromTailToHead();
    }

}
