package comp249_section_d;

public class Node1 {

    private int data; // Data, can be anything (can be generic)
    private Node1 referenceToFollowingElement;

    public Node1(int data, Node1 link) {
        this.data = data;
        this.referenceToFollowingElement = link;
    }

    // This is terrible, we will fix it later
    public Node1 getReferenceToFollowingElement() {
        return this.referenceToFollowingElement;
    }

    public void setReferenceToFollowingElement(Node1 link) {
        this.referenceToFollowingElement = link;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
