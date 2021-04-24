package ds;

import ds.Arrays.sorting.BubbleSort;
import ds.Arrays.sorting.InsersionSort;
import ds.Arrays.sorting.MergeSort;
import ds.Arrays.sorting.SelectionSort;
import ds.hashset.CustomHashSet;
import ds.hashset.SimpleHashSet;
import ds.lists.DoubleLinkedList;
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
        //Test Sorting alogrithms
        System.out.println(Arrays.toString(new BubbleSort().sort()));
        System.out.println(Arrays.toString(new SelectionSort().sort()));
        System.out.println(Arrays.toString(new InsertionSort().sort()));
        System.out.println(Arrays.toString(new MergeSort().sort()));
        */

        /*
        //Test Tree
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

        /*
        //Test DoubleLinkedList
        DoubleLinkedList list = new DoubleLinkedList();
        list.printAll();
        list.addToFront("kumar");
        list.addToFront("ajay");
        list.addToFront("a v d m s");
        list.printAll();
        list.addToEnd("Satya");
        list.addToEnd("Dev");
        list.addToEnd("Seshagiri Rao");
        list.printAll();
        System.out.println(list.deleteFromFront());
        System.out.println(list.deleteFromFront());
        System.out.println(list.deleteFromFront());
        System.out.println(list.getSize());
        list.printAll();
        list.addToFront("kumar");
        list.addToFront("ajay");
        list.addToFront("a v d m s");
        System.out.println(list.getSize());
        list.printAll();
        System.out.println(list.deleteFromEnd());
        System.out.println(list.deleteFromEnd());
        System.out.println(list.deleteFromEnd());
        System.out.println(list.getSize());
        list.printAll();
        */

        /*
        // Test HashSets both simple and custom
        SimpleHashSet hs = new SimpleHashSet();
        //CustomHashSet hs = new CustomHashSet()
        System.out.println(hs.contains(1001));
        hs.add(1001);
        System.out.println(hs.contains(1001));
        hs.remove(1001);
        System.out.println(hs.contains(1001));
        System.out.println(hs.contains(1002543421));
        hs.add(861);
        System.out.println(hs.contains(861));
        hs.remove(862);
        System.out.println(hs.contains(861));
        */
    }
}
