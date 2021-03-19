package ds.lists;

public class SingleLinkedList {

    Node head;

    int size;

    public void addToFront(String value) {
        Node newNode = new Node(value);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public String deleteFromFront(){

        String removedElement = head.getElement();
        head = head.getNext();
        size--;
        return removedElement;
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
            System.out.print(" -> ");
            current = current.next;
        }
        System.out.println("null");

    }
}
