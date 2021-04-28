package ds.maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CustomMap {

    private Map<Integer, Integer> map = new HashMap<>();
    private Set<Integer> set =new HashSet<>();
    Integer forAll;

    public void set(int key, int value){
        map.put(key, value);
        set.add(key);
    }

    public Integer get(int key){
        if(map != null && map.containsKey(key)) return map.get(key);
        else if (set != null && set.contains(key)) return forAll;
        else return null;
    }

    public void setAll(int value){
        map = new HashMap<>();
        forAll = value;
    }

    public void removeAll(){
        forAll = null;
        map = new HashMap<>();
        set = new HashSet<>();
    }


}
