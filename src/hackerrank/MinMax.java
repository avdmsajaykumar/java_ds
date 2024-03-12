package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MinMax {

    static{
        System.out.println("first min max");
    }

    static Integer min1, min2, max1, max2;
    static List<Integer> array = new ArrayList<>();


    public static void main(String[] args){
        Random();
        System.out.println(array.toString());
        findMinMax();
        System.out.println(array.stream().sorted().toList());
        System.out.printf("%d, %d are min, %d, %d are max\n", min1,min2, max1, max2);

    }

    static void Random(){
        array = new Random()
                .ints(-1000, 1000)
                .limit(25)
                .boxed()
                .toList();

    }

    static void findMinMax(){
        min1 = array.get(0);
        min2 = array.get(0);
        max1 = array.get(0);
        max2 = array.get(0);
        for (Integer j : array) {
            if (j < min1) {
                min2 = min1;
                min1 = j;
            } else if (j < min2) {
                min2 = j;
            }

            if (j > max1) {
                max2 = max1;
                max1 = j;
            } else if (j > max2) {
                max2 = j;
            }
        }

    }
}
