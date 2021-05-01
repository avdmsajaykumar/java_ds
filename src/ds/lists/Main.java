package ds.lists;

public class Main {

    public static void main(String[] args) {

        System.out.println("*************************SingleLinkedList**************************");
        SingleLinkedList<Integer> sl = new SingleLinkedList<>();
        sl.addToFront(1);
        sl.addToFront(2);
        sl.addToFront(3);
        sl.addToFront(4);
        sl.addToFront(5);
        sl.printAll();
//        sl.swap(2,4);
        sl.printAll();
//        sl.swap(1,5);
        sl.printAll();
//        sl.swap(3,6);
        sl.printAll();
        sl.PopNthIndexFromBack(6);
        sl.printAll();
        System.out.println("*************************SingleLinkedList**************************");

        System.out.println("*************************DoubleLinkedList**************************");
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
        System.out.println("*************************DoubleLinkedList**************************");

    }

}
