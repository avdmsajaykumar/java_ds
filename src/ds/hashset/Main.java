package ds.hashset;

import ds.maps.CustomMap;

public class Main {

    public static void main(String[] args) {

        // Test HashSets both simple and custom
        System.out.println("************ Custom Hash & Simple Hash *****************");
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
        System.out.println("************ Custom Hash & Simple Hash *****************");

    }
}
