package ds;

import ds.Arrays.sorting.*;
import ds.hashset.CustomHashSet;
import ds.hashset.SimpleHashSet;
import ds.lists.DoubleLinkedList;
import ds.lists.SingleLinkedList;
import ds.maps.CustomMap;
import ds.trees.Tree;
import hrprograms.Permutation;
import hrprograms.Singleton;

import java.sql.SQLOutput;
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
        System.out.println(Arrays.toString(new QuickSort().sort()));
        System.out.println(Arrays.toString(new QuickSort().sort()));
        */

        /* Singleton class checks
        Singleton one = Singleton.getInstance();
        Singleton two = Singleton.getInstance();

        one.setA(10);
        one.setB(20);

        System.out.println(two.getA() + "\t" + two.getB());

        two.setA(15);
        one.setB(25);
        System.out.println(one.getA() + "\t" + one.getB());
         */

        /* Testing CustomMap
        CustomMap m = new CustomMap();
        m.set(1, 5);
        m.set(2, 6);
        m.set(3, 7);
        m.set(2, 8);
        System.out.println(m.get(1) + "\t" + m.get(2) + "\t" + m.get(3) + "\t" + m.get(4));
        m.setAll(10);
        System.out.println(m.get(1) + "\t" + m.get(2) + "\t" + m.get(3) + "\t" + m.get(4));
        m.set(1, 1);
        m.set(4, 11);
        System.out.println(m.get(1) + "\t" + m.get(2) + "\t" + m.get(3) + "\t" + m.get(4));
        m.removeAll();
        System.out.println(m.get(1) + "\t" + m.get(2) + "\t" + m.get(3) + "\t" + m.get(4));
        m.set(1, 5);
        m.set(2, 6);
        m.set(3, 7);
        m.set(2, 8);
        System.out.println(m.get(1) + "\t" + m.get(2) + "\t" + m.get(3) + "\t" + m.get(4));
         */

//        /*
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
        System.out.println();
        t.traverseLevelOrder();

//         */

        /*
        //Test DoubleLinkedList
        DoubleLinkedList<String> list = new DoubleLinkedList<>();
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

        /* Testing Permutations
        new Permutation("abc").listAll();
        new Permutation("6789").listAll();
         */

        /* SingleLinkedList testing
        SingleLinkedList<Integer> sl = new SingleLinkedList<>();
        sl.addToFront(1);
        sl.addToFront(2);
        sl.addToFront(3);
        sl.addToFront(4);
        sl.addToFront(5);
        sl.printAll();
        sl.swap(2,4);
        sl.printAll();
        sl.swap(1,5);
        sl.printAll();
        sl.swap(3,6);
        sl.printAll();
         */
    }
}
