package comp249_section_d;

public class LinkedList2 {

    private Node2 head;
    private int numberOfElements;

    public LinkedList2() {
        head = null;
        numberOfElements = 0;
    }

    public void addAtHead(int data) {
        head = new Node2(data, head);
        numberOfElements++;
    }

    public void addAtTail(int data) {
        if (head == null) {
            addAtHead(data);
        } else {
            // Go all the way from head to last element
            Node2 temp = head;
            while (temp.link != null) {
                temp = temp.link;
            }

            Node2 n = new Node2(data, null);
            temp.link = n;
            numberOfElements++;
        }
    }

    // elementValue is/isn't in the list (if elementValue is not in the list, we don't add)
    public void addAfter(int data, int referenceValue) {
        if (head != null) {
            Node2 temp = head;
            while (temp != null && temp.data != referenceValue) {
                temp = temp.link;
            }
            if (temp != null) {
                Node2 n = new Node2(data, temp.link);
                temp.link = n;
                numberOfElements++;
            }
        }
    }

    // Add before a value
    // delete from head
    public int removeFromHead() {
        if (head != null) {
            Node2 temp = head;
            head = head.link;
            numberOfElements--;

            return temp.data;
        } else {
            return -1;
        }
    }

    // delete the last one
    public int removeTail() {
        if (head != null) {
            if (head.link == null) {
                return removeFromHead();
            } else {
                Node2 temp = head;

                while (temp.link.link != null) {
                    temp = temp.link;
                }

                Node2 n = temp.link;

                temp.link = null;
                numberOfElements--;
                return n.data;
            }
        } else {
            return -1;
        }
    }

    // delete a specific value
    public void removeData(int data) {
        if (head != null) {
            if (head.data == data) {
                removeFromHead();
            } else {
                Node2 temp = head;
                while (temp.link != null && temp.link.data != data) {
                    temp = temp.link;
                }
                if (temp.link != null) {
                    temp.link = temp.link.link;
                    numberOfElements--;
                }

            }
        }

    }

    public void display() {
        if (head == null) {
            System.out.println("No data to display");
        } else {
            System.out.println("Here are your data: ");
            Node2 temp = head;
            while (temp != null) {
                // display data
                System.out.print(temp.data + "  ");
                // move to next
                temp = temp.link;
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
        Node2 temp = head;
        while (temp != null) {
            counter++;
            temp = temp.link;
        }
        return counter;
    }

    private class Node2 {

        private int data; // Data, can be anything (can be generic)
        private Node2 link;

        public Node2(int data, Node2 link) {
            this.data = data;
            this.link = link;
        }

    }

}
