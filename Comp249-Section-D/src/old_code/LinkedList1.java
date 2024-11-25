package old_code;

public class LinkedList1 {

    private Node1 head;
    private int numberOfElements;

    public LinkedList1() {
        head = null;
        numberOfElements = 0;
    }

    public void addAtHead(int data) {
        head = new Node1(data, head);
        numberOfElements++;
    }

    public void addAtTail(int data) {
        if (head == null) {
            addAtHead(data);
        } else {
            // Go all the way from head to last element
            Node1 temp = head;
            while (temp.getReferenceToFollowingElement() != null) {
                temp = temp.getReferenceToFollowingElement();
            }

            Node1 n = new Node1(data, null);
            temp.setReferenceToFollowingElement(n);
            numberOfElements++;
        }
    }

    // elementValue is/isn't in the list (if elementValue is not in the list, we don't add)
    public void addAfter(int data, int referenceValue) {
        if (head != null) {
            Node1 temp = head;
            while (temp != null && temp.getData() != referenceValue) {
                temp = temp.getReferenceToFollowingElement();
            }
            if (temp != null) {
                Node1 n = new Node1(data, temp.getReferenceToFollowingElement());
                temp.setReferenceToFollowingElement(n);
                numberOfElements++;
            }
        }
    }

    // Add before a value
    // delete from head
    public Node1 removeFromHead() {
        if (head != null) {
            Node1 temp = head;
            head = head.getReferenceToFollowingElement();
            numberOfElements--;
            temp.setReferenceToFollowingElement(null); // Sanitization
            return temp;
        } else {
            return null;
        }
    }

    // delete the last one
    public Node1 removeTail() {
        if (head != null) {
            if (head.getReferenceToFollowingElement() == null) {
                return removeFromHead();
            } else {
                Node1 temp = head;

                while (temp.getReferenceToFollowingElement().getReferenceToFollowingElement() != null) {
                    temp = temp.getReferenceToFollowingElement();
                }

                Node1 n = temp.getReferenceToFollowingElement();
                temp.setReferenceToFollowingElement(null);
                n.setReferenceToFollowingElement(null); // Sanitization
                numberOfElements--;
                return n;
            }
        } else {
            return null;
        }
    }

    // delete a specific value
    public void removeData(int data) {
        if (head != null) {
            if (head.getData() == data) {
                removeFromHead();
            } else {
                Node1 temp = head;
                while (temp.getReferenceToFollowingElement() != null && temp.getReferenceToFollowingElement().getData() != data) {
                    temp = temp.getReferenceToFollowingElement();
                }
                if (temp.getReferenceToFollowingElement() != null) {
                    temp.setReferenceToFollowingElement(temp.getReferenceToFollowingElement().getReferenceToFollowingElement());
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
            Node1 temp = head;
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
        Node1 temp = head;
        while (temp != null) {
            counter++;
            temp = temp.getReferenceToFollowingElement();
        }
        return counter;
    }

}
