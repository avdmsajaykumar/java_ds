package ds.Arrays.sorting;

import java.util.Arrays;

public class InsertionSort implements Sort{

    public static void main(String[] args) {
        Sort sort = new InsertionSort();
        System.out.println(Arrays.toString(sort.sort()));
    }

    public int[] sort() {
        System.out.println("InsertionSort");
        int[] intArray = {2, 4, 73, 12, 3, 65, 341, 0, -21};
        System.out.println(Arrays.toString(intArray));

        for (int unsortedIndex = 1; unsortedIndex < intArray.length; unsortedIndex++) {

            int newElement = intArray[unsortedIndex];

            int i;
            for (i = unsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }
            intArray[i] = newElement;
        }


        return intArray;
    }
}
/* Conditions
   - On each iteration 1st element have the sorted value
   - traverse from 2nd element to last element using an outer loop
   - take the 2nd element to a new variable
   - create a inner loop and compare present and previous element
   - if current element index is greater than 0 and previous element value is greater than the new variable.
     then shift the previous index to current one(since the current element value is stored separately it won't be lost)
   - when condition fails exit the loop and place the new element in that index value where the condition fails.
     (This will ensure the value is inserted in proper position)

 */
