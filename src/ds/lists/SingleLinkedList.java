package ds.lists;

public class SingleLinkedList<T> {

    Node<T> head;

    int size;

    public void addToFront(T value) {
        Node<T> node = new Node<>(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public T deleteFromFront(){

        if (isEmpty()) {
            return null;
        }

        T removedElement = head.getElement();
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

        Node<T> current = head;
        System.out.print("Head -> ");
        while (current != null) {
            System.out.print(current.getElement());
            System.out.print(" -> ");
            current = current.next;
        }
        System.out.println("null");

    }

    //1 2 3 4 5 6 7 8 9 10

    public T PopNthIndexFromBack(Integer index){

        T result = null;

        Node <T> fastNode = head;
        Node<T> slowNode = head;

        if (head == null) return null;

        for (int i = 0; i < index; i++) {
            if (fastNode.getNext() != null){
                fastNode = fastNode.getNext();
            }else return null;
        }

        while (fastNode.getNext() != null){
            slowNode = slowNode.getNext();
            fastNode = fastNode.getNext();
        }

        result = slowNode.getElement();
        slowNode.setNext(slowNode.getNext().getNext());
        return result;

    }

    public void swap(T a, T b){
        if (a == b) return;

        Node<T> prevA = null, prevB = null;
        Node<T> currA = head, currB = head;


        while (currA != null && !currA.getElement().equals(a)){
            prevA = currA;
            currA = currA.getNext();

        }

        while (currB != null && !currB.getElement().equals(b)){
            prevB = currB;
            currB = currB.getNext();
        }

        if (currA == null || currB == null) return;

        if (prevA != null) {
            prevA.setNext(currB);
        }else{
            head = currB;
        }

        if (prevB != null){
            prevB.setNext(currA);
        }else {
            head = currA;
        }

        Node<T> temp = currA.getNext();
        currA.setNext(currB.getNext());
        currB.setNext(temp);

    }
}
