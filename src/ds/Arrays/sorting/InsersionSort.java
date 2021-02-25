package ds.Arrays.sorting;

import java.util.Arrays;

public class InsersionSort {


    public int[] sort() {
        int[] intarray = {2, 4, 73, 12, 3, 65, 341, 0, -21};
        System.out.println(Arrays.toString(intarray));

        for (int unsortedIndex = 1; unsortedIndex < intarray.length; unsortedIndex++) {

            int newElement = intarray[unsortedIndex];

            int i;
            for (i = unsortedIndex; i > 0 && intarray[i - 1] > newElement; i--) {
                intarray[i] = intarray[i - 1];
            }

            intarray[i] = newElement;


        }


        return intarray;
    }
}
