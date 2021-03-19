package ds;

import ds.Arrays.sorting.BubbleSort;
import ds.Arrays.sorting.InsersionSort;
import ds.Arrays.sorting.MergeSort;
import ds.Arrays.sorting.SelectionSort;
import ds.lists.SingleLinkedList;
import ds.trees.Tree;

import java.util.Arrays;

public class MainClass {

    static int count = 5;
    static int value = 1;

    public static void main(String[] args) {

        /*
        for (int i = 1; i <=count ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(value + " ");
                value++;
            }
            System.out.println();
        }
        */

        /*
        System.out.println(Arrays.toString(new BubbleSort().sort()));
        System.out.println(Arrays.toString(new SelectionSort().sort()));
        System.out.println(Arrays.toString(new InsertionSort().sort()));
        System.out.println(Arrays.toString(new MergeSort().sort()));


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

         */

        SingleLinkedList list = new SingleLinkedList();
        list.printAll();
        list.addToFront("ajay");
        list.addToFront("kumar");
        list.addToFront("a v d m s");
        list.printAll();
        System.out.println(list.deleteFromFront());
        System.out.println(list.deleteFromFront());
        System.out.println(list.getSize());
    }
}
