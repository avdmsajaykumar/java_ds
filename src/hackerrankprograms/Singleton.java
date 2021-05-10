package hackerrankprograms;

import java.io.*;

public class Singleton implements Serializable {

    private static Singleton instance = null;
    private int a, b = 0;

    private Singleton() {

        //This is to prevent modification of singleton class using reflection
        if (instance!=null) try {
            throw new InstantiationException("Object Creation not allowed");
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

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

    public static Singleton getInstance() {
        if(instance == null) instance = new Singleton();
        return instance;
    }


    //This method will prevent the new object creation while serializing and deserializing
    @Serial
    protected Object readResolve()
    {
        return instance;
    }

    //This method will prevent the new object creation by cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public static void main(String[] args) throws Exception {
//        /* Singleton class checks
//        Singleton one = Singleton.getInstance();
//        Singleton two = Singleton.getInstance();
//
//        one.setA(10);
//        one.setB(20);
//
//        System.out.println(two.getA() + "\t" + two.getB());
//
//        two.setA(15);
//        one.setB(25);
//        System.out.println(one.getA() + "\t" + one.getB());
//         */


        try
        {
            Singleton instance = Singleton.getInstance();
            ObjectOutput out
                    = new ObjectOutputStream(new FileOutputStream("file.text"));
            out.writeObject(instance);
            out.close();

            // deserailize from file to object
            ObjectInput in
                    = new ObjectInputStream(new FileInputStream("file.text"));
            Singleton instance2 = (Singleton) in.readObject();
            in.close();

            System.out.println("instance1 hashCode:- "
                    + instance.hashCode());
            System.out.println("instance2 hashCode:- "
                    + instance2.hashCode());
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
