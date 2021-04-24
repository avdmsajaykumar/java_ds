package ds.hashset;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomHashSet {

    private static final int ARRAY_SIZE = 100;
    private static final int MAX_VALUE = 10000;
    private List<List<Integer>> parentList;


    public CustomHashSet() {
        parentList = new ArrayList<>(ARRAY_SIZE);
        for (int i = 0; i < ARRAY_SIZE; i++) {
            parentList.add(null);
        }
    }

    public void add(int key) {
        if (isAboveMax(key)) return;

        int index = key % ARRAY_SIZE;
        List<Integer> childList = parentList.get(index);
        if (childList == null) {
            List<Integer> list = new LinkedList<>();
            list.add(key);
            parentList.set(index, list);
        } else {
            if (!childList.contains(key)) {
                childList.add(key);
            }
        }

    }

    public void remove(int key) {
        if (isAboveMax(key)) return;

        int index = key % ARRAY_SIZE;
        List<Integer> childList = parentList.get(index);
        if (childList != null) childList.remove(Integer.valueOf(key));

    }

    public boolean contains(int key) {
        if (isAboveMax(key)) return false;

        int index = key % ARRAY_SIZE;
        List<Integer> childList = parentList.get(index);
        if (childList == null) return false;
        else return childList.contains(key);

    }

    private boolean isAboveMax(int key) {
        return key > MAX_VALUE;
    }
}
