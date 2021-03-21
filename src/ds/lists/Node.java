package ds.lists;

public class Node {

    String element;
    Node next;
    Node prev;

    public Node(String element) {
        this.element = element;
    }

    public String getElement() {
        return element;
    }

    public Node getNext() {
        return next;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public void setNext(Node next) {
        this.next = next;
    }


    public Node getPrev() { return prev; }

    public void setPrev(Node prev) { this.prev = prev; }

    @Override
    public String toString() {
        return "Node{" +
                "element='" + element + '\'' +
                '}';
    }
}
