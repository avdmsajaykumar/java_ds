package ds.lists;

public class DoubleLinkedList<T> {

    Node<T> head;
    Node<T> tail;
    int size;

    public void addToFront(T element){
        Node<T> node = new Node<>(element);
        node.setNext(head);
        if (head == null) {
            tail = node;
        }else{
            head.setPrev(node);
        }
        head = node;
        size++;
    }

    public void addToEnd(T element) {
        Node<T> node = new Node<>(element);
        node.setPrev(tail);
        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
        size++;
    }

    public T deleteFromFront(){

        if (isEmpty()) {
            return null;
        }

        T removedElement = head.getElement();

        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrev(null);
        }

        head = head.getNext();
        size--;
        return removedElement;
    }

    public T deleteFromEnd(){
        if (isEmpty()) {
            return null;
        }

        T element = tail.getElement();

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

        Node<T> current = head;
        System.out.print("Head -> ");
        while (current != null) {
            System.out.print(current.getElement());
            System.out.print(" <=> ");
            current = current.next;
        }
        System.out.println("null");

    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }
}
