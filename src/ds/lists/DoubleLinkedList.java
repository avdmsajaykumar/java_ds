package ds.lists;

public class DoubleLinkedList {

    Node head;
    Node tail;
    int size;

    public void addToFront(String element){
        Node node = new Node(element);
        node.setNext(head);
        if (head == null) {
            tail = node;
        }else{
            head.setPrev(node);
        }
        head = node;
        size++;
    }

    public void addToEnd(String element) {
        Node node = new Node(element);
        node.setPrev(tail);
        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
        size++;
    }

    public String deleteFromFront(){

        if (isEmpty()) {
            return null;
        }

        String removedElement = head.getElement();

        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrev(null);
        }

        head = head.getNext();
        size--;
        return removedElement;
    }

    public String deleteFromEnd(){
        if (isEmpty()) {
            return null;
        }

        String element = tail.getElement();

        if (tail.getPrev() == null) {
            head = null;
        } else {
            tail.getPrev().setNext(null);
        }
        tail = tail.getPrev();
        size--;
        return element;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public void printAll() {
        if (head == null) {
            System.out.println("empty");
            return;
        }

        Node current = head;
        System.out.print("Head -> ");
        while (current != null) {
            System.out.print(current.getElement());
            System.out.print(" <=> ");
            current = current.next;
        }
        System.out.println("null");

    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }
}
