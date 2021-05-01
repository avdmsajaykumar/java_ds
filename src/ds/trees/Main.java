package ds.trees;

public class Main {

    public static void main(String[] args) {
        Tree t = new Tree();
        t.insert(4);
        t.insert(32);
        t.insert(211);
        t.insert(30);
        t.insert(40);
        t.insert(20);
        t.insert(-30);
        t.insert(-10);
        t.insert(0);

        t.traverseInOrder();
        System.out.println();

        t.traversePreOrder();
        System.out.println();

        t.traversePostOrder();
        System.out.println();

        t.traverseLevelOrder();
    }
}
