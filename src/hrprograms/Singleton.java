package hrprograms;

public class Singleton {

    private static Singleton instance = null;
    private int a, b = 0;

    private Singleton(){

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

    public static Singleton getInstance(){
        if(instance == null) instance = new Singleton();
        return instance;
    }
}
