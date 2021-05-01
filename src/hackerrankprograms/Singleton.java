package hackerrankprograms;

public class Singleton {

    private static Singleton instance = null;
    private int a, b = 0;

    private Singleton() throws Exception {
        if (instance!=null) throw new Exception();

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static Singleton getInstance() throws Exception {
        if(instance == null) instance = new Singleton();
        return instance;
    }

    public static void main(String[] args) throws Exception {
//        /* Singleton class checks
        Singleton one = Singleton.getInstance();
        Singleton two = Singleton.getInstance();

        one.setA(10);
        one.setB(20);

        System.out.println(two.getA() + "\t" + two.getB());

        two.setA(15);
        one.setB(25);
        System.out.println(one.getA() + "\t" + one.getB());
//         */

    }
}
