package ds.maps;

public class Main {

    public static void main(String[] args) {

        System.out.println("************ Custom Map *****************");
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
        System.out.println("************ Custom Map *****************");
    }
}
