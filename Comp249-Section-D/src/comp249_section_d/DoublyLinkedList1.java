package comp249_section_d;

public class DoublyLinkedList1 {

    private Node head;
    private Node tail;
    private int numberOfElements;

    public DoublyLinkedList1() {
        head = null;
        tail = null;
        numberOfElements = 0;
    }

    public void addAtHead(int data) {
        // Create the new node
        Node n = new Node(data, null, head);

        // Update head
        head = n;

        // May be, update tail
        if (tail == null) {
            tail = n;
        }

        this.numberOfElements++;
    }

    public void addAtTail(int data) {
        if (tail == null) {
            addAtHead(data);
        } else {
            // Create the node
            Node n = new Node(data, tail, null);

            // Link the existing tail to the new node
            tail.next = n;

            // Update tail to new Node
            tail = n;

            // May be, update head
            if (head == null) {
                head = n;
            }
            this.numberOfElements++;
        }
    }

    public void addAfter(int data, int referenceValue) {

        if (head == null) {
            return;
        }

        Node temp = head;

        while (temp != null && temp.data != referenceValue) {
            temp = temp.next;
        }

        if (temp != null) {
            if (temp == tail) {
                addAtTail(data);
            } else {
                Node n = new Node(data, temp, temp.next);
                temp.next = n;
                n.next.previous = n;
                this.numberOfElements++;
            }
        }
    }

    public int deleteFromHead() {
        if (head != null) {
            if (head == tail) {
                int v = head.data;
                head = null;
                tail = null;
                numberOfElements = 0;
                return v;
            } else {

            }
        }
    }

    public void displayFromTailToHead() {
        if (tail == null) {
            System.out.println("No data to display");
        } else {
            System.out.println("Here are your data: ");
            Node temp = tail;
            while (temp != null) {
                // display data
                System.out.print(temp.data + "  ");
                // move to next
                temp = temp.previous;
            }
        }
    }

    public void displayFromHeadToTail() {
        if (head == null) {
            System.out.println("No data to display");
        } else {
            System.out.println("Here are your data: ");
            Node temp = head;
            while (temp != null) {
                // display data
                System.out.print(temp.data + "  ");
                // move to next
                temp = temp.next;
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
            temp = temp.next;
        }
        return counter;
    }

    private class Node {

        private int data; // Data, can be anything (can be generic)
        private Node previous;
        private Node next;

        public Node(int data, Node previous, Node next) {
            this.data = data;
            this.previous = previous;
            this.next = next;
        }
    }
}
