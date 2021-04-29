package ds.lists;

class Node<T> {

    T element;
    Node<T> next;
    Node<T> prev;

    public Node(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }


    public Node<T> getPrev() { return prev; }

    public void setPrev(Node<T> prev) { this.prev = prev; }

    @Override
    public String toString() {
        return "Node{" +
                "element='" + element + '\'' +
                '}';
    }
}
