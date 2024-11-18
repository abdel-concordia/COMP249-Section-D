package comp249_section_d;

public class LinkedList1 {

    private Node head;
    private int numberOfElements;

    public LinkedList1() {
        head = null;
        numberOfElements = 0;
    }

    public void addAtHead(int data) {
        head = new Node(data, head);
        numberOfElements++;
    }

    public void addAtTail(int data) {
        if (head == null) {
            addAtHead(data);
        } else {
            // Go all the way from head to last element
            Node temp = head;
            while (temp.getReferenceToFollowingElement() != null) {
                temp = temp.getReferenceToFollowingElement();
            }

            Node n = new Node(data, null);
            temp.setReferenceToFollowingElement(n);
            numberOfElements++;
        }
    }

    public void addAfter(int data, int elementValue) {
        // list is empty/not empty
        // elementValue is/isn't in the list (if elementValue is not in the list, we don't add)
    }

    // delete from head
    // delete the last one
    // delete a specific value
    public void display() {
        if (head == null) {
            System.out.println("No data to display");
        } else {
            System.out.println("Here are your data: ");
            Node temp = head;
            while (temp != null) {
                // display data
                System.out.print(temp.getData() + "  ");
                // move to next
                temp = temp.getReferenceToFollowingElement();
            }
        }
    }

    // Size using a counter
    public int size1() {
        return this.numberOfElements;
    }

    // Size without using a counter
    public int size2() {
        int counter = 0;
        Node temp = head;
        while (temp != null) {
            counter++;
            temp = temp.getReferenceToFollowingElement();
        }
        return counter;
    }

}
