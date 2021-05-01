package ds.Arrays.sorting;

import java.util.Arrays;

public class QuickSort implements Sort {

    int[] intarray = {2, 4, 73, 12, 3, 65, 341, 0, -21};

    public int[] sort() {
        System.out.println("QuickSort");
        System.out.println(Arrays.toString(intarray));
        Quick(intarray, 0, intarray.length);
        return intarray;
    }

    private void Quick(int[] intarray, int start, int end) {

        if (end - start < 2) return;

        int pivot = partition(intarray, start, end);
        Quick(intarray, start, pivot);
        Quick(intarray, pivot + 1, end);
    }

    private int partition(int[] intarray, int start, int end) {
        int pivot = intarray[start];
        int i = start;
        int j = end;

        while (i < j) {

            while (i < j && intarray[--j] >= pivot) ;
            if (i < j) intarray[i] = intarray[j];

            while (i < j && intarray[++i] <= pivot) ;
            if (i < j) intarray[j] = intarray[i];
        }

        intarray[j] = pivot;
        return j;
    }
}
/*      Algorithm
        - Find the pivot and sort all other elements around the pivot. This will put pivot in proper position even
          though other elements are not in proper position
        - Take the left array to pivot and repeat the logic
        - Do the same for right array, repeat the process until all elements are considered as pivots and are moved to
          proper positions

        *To Find pivot
        - Consider first element as pivot for a given array
        - Take 2 variables i and j and assign them the start and end index of the given array
        - start from back of array so take array and traverse back. compare each element with pivot
          If element is larger than pivot than pivot then stop the iteration and put the element to Ith index
        - now start from ith + 1 index and traverse forward the same array. compare each element with pivot
          If element is smaller than pivot then stop the iteration and put the element to Jth index
        - stop the iteration when ith crosses jth index
        - swap the pivot to Jth index this will put the pivot in right postion of the array

 */