package ds.Arrays.sorting;

import java.util.Arrays;

//stable
public class MergeSort implements Sort {

    public int[] sort() {
        System.out.println("MergeSort");
        int[] intarray = {2, 4, 73, 12, 3, 65, 341, 0, -21};
//        int[] intarray = {2, 73, 12, 11};
        System.out.println(Arrays.toString(intarray));

        split(intarray, 0, intarray.length);

        return intarray;

    }

    private void split(int[] array, int start, int end) {

        if (end -start < 2) return;
        int midpoint = (start + end) / 2;
        split(array, start, midpoint);
        split(array, midpoint, end);
        merge(array, start, midpoint, end);

    }

    private void merge(int[] array, int start, int midpoint, int end) {

        if (array[midpoint - 1] < array[midpoint]) return;

        int leftArrayIndex = start;
        int rightArrayIndex = midpoint;
        int tempIndex = 0;
        int[] tempArray = new int[end - start];

        while (leftArrayIndex < midpoint && rightArrayIndex < end) {
            tempArray[tempIndex++] =
                    array[leftArrayIndex] <= array[rightArrayIndex]
                            ? array[leftArrayIndex++] : array[rightArrayIndex++];
        }

        if (leftArrayIndex >= midpoint) {
            while (tempIndex < tempArray.length) {
                tempArray[tempIndex++] = array[rightArrayIndex++];
            }
        } else if (rightArrayIndex >= end) {
            while (tempIndex < tempArray.length) {
                tempArray[tempIndex++] = array[leftArrayIndex++];
            }
        }

        for (int i = start; i < end; i++) {
            array[i] = tempArray[i - start];
            //System.arraycopy(tempArray, start - start, array, start, end - start);
        }
    }
}
/*
    Algorithm:
    -   Split the array into sub arrays using recursion or loops until each array has 1 element.
    -   after that merge the adjacent arrays.
    -   During Merge operation take 3 indexes
            1 index for left array which start from start to mid
            1 index for right array which start from mid to end
            1 index as 0 for a new temp array with size end - start
    -   for Merging compare left array element with right array element and add the smallest of them to temp array
    -   then increment the array indexes of temp array and the array where the value us picked
    -   do this until one array is completed added to temp.
    -   then add the remaining elements in the other array to the end of temp array this will give the sorted array
    -   At last replace the temp array in the actual array

 */