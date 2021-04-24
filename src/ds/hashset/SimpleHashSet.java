package ds.hashset;

public class SimpleHashSet {

    private boolean[] array;

    public SimpleHashSet(){
        array = new boolean[2000000000];
    }

    public void add(int key){
        array[key] = true;
    }

    public void remove(int key){
        array[key] = false;
    }

    public boolean contains(int key){
        return array[key];
    }
}
