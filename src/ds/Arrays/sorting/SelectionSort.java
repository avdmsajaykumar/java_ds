package ds.Arrays.sorting;

import java.util.Arrays;

public class SelectionSort {

    //Unstable Algorithm

    public int[] sort(){
        int[] intarray = {2, 4, 73, 12, 3, 65, 341, 0, -21};
        System.out.println(Arrays.toString(intarray));

        for (int lastIndex = intarray.length - 1; lastIndex > 0 ; lastIndex--) {

            int largeElementIndex = 0;
            for (int i = 0; i <= lastIndex; i++) {
                if (intarray[i] >intarray[largeElementIndex]) {
                    largeElementIndex = i;
                }
            }

            int temp = intarray[lastIndex];
            intarray[lastIndex] = intarray[largeElementIndex];
            intarray[largeElementIndex] = temp;
        }

        return intarray;
    }
}
