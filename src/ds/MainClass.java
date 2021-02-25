package ds;

import ds.Arrays.sorting.BubbleSort;
import ds.Arrays.sorting.InsersionSort;
import ds.Arrays.sorting.SelectionSort;

import java.util.Arrays;

public class MainClass {

    static int count = 5;
    static int value = 1;

    public static void main(String[] args){

        /*
        for (int i = 1; i <=count ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(value + " ");
                value++;
            }
            System.out.println();
        }
        */

        /*
        System.out.println(Arrays.toString(new BubbleSort().sort()));
        System.out.println(Arrays.toString(new SelectionSort().sort()));

         */
        System.out.println(Arrays.toString(new InsersionSort().sort()));
    }
}
