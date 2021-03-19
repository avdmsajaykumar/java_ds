package ds.lists;

public class Node {

    String element;
    Node next;

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

    @Override
    public String toString() {
        return "Node{" +
                "element='" + element + '\'' +
                '}';
    }
}
