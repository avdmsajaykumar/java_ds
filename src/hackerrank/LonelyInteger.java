package hackerrank;

import java.util.*;

public class LonelyInteger {

    public static int lonelyinteger(List<Integer> a) {
        if(a.size()==1) return a.get(0);
        Collections.sort(a);
        int i = 0;
        System.out.println(a);
        while(i < a.size()-1 && a.get(i).equals(a.get(i+1))){
            i+=2;
        }
        return a.get(i);
    }
}
