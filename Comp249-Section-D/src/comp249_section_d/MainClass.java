package comp249_section_d;

public class MainClass {

    public static void main(String[] args) { // Static context

        LinkedList2 myList = new LinkedList2();

        myList.addAtTail(7);
        myList.addAtTail(20);
        myList.addAfter(10, 7);

        int v = myList.removeFromHead();

        System.out.println("You have " + myList.size1() + " elements.");
        myList.display();

    }

}
