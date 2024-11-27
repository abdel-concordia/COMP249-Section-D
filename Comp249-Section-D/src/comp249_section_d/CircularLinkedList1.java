package comp249_section_d;

public class CircularLinkedList1 {

    private Node head;
    private Node tail;
    private int numberOfElements;

    public CircularLinkedList1() {
        head = null;
        tail = null;
        numberOfElements = 0;
    }

    public void addAtHead(int value) {
        Node n = new Node(value, head);

        if (head == null) {
            head = n;
            n.link = n;
            tail = n;
        } else {
            head = n;
            tail.link = head;
        }
    }

    // add at tail
    // add after
    // remove from head
    // remove from tail
    // remove value
    public void displayElements() {
        if (head == null) {
            System.out.println("No data to display");
        } else {
            Node temp = head;

            do {
                System.out.print(temp.data + "  ");
                temp = temp.link;
            } while (temp != head);
        }
    }

    private class Node {

        private int data; // Data, can be anything (can be generic)
        private Node link;

        public Node(int data, Node link) {
            this.data = data;
            this.link = link;
        }
    }
}
