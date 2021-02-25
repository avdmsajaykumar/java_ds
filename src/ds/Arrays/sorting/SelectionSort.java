package ds.Arrays.sorting;

import java.util.Arrays;

public class SelectionSort {

    //Unstable Algorithm

    public int[] sort() {
        int[] intarray = {2, 4, 73, 12, 3, 65, 341, 0, -21};
        System.out.println(Arrays.toString(intarray));

        for (int lastIndex = intarray.length - 1; lastIndex > 0; lastIndex--) {

            int largeElementIndex = 0;
            for (int i = 0; i <= lastIndex; i++) {
                if (intarray[i] > intarray[largeElementIndex]) {
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

/* Conditions:
    - last index will have sorted value after each iteration of outer loop
    - on each outer loop iteration, consider 1st element is largest and take it index value as large index
    - traverse the array using inner loop only till unsorted part of the array
    - compare value at i'th index to the large index if i'th index is having greater value. store the large index with
      i
    - After the end of iteration. swap the element at large index iwth the last element of the outer loop
    */
