package ds.Arrays.sorting;

import java.util.Arrays;

public class QuickSort implements Sort {
    public static void main(String[] args) {
        Sort sort = new QuickSort();
        System.out.println(Arrays.toString(sort.sort()));
    }
    int[] intArray = {2, 4, 73, 12, 3, 65, 341, 0, -21};

    public int[] sort() {
        System.out.println("QuickSort");
        System.out.println(Arrays.toString(intArray));
        Quick(intArray, 0, intArray.length);
        return intArray;
    }

    private void Quick(int[] intarray, int start, int end) {

        if (end - start < 2) return;

        int pivot = partition(intarray, start, end);
        Quick(intarray, start, pivot);
        Quick(intarray, pivot + 1, end);
    }

    private int partition(int[] intArray, int start, int end) {
        int pivot = intArray[start];
        int i = start;
        int j = end;

        while (i < j) {

            while (i < j && intArray[--j] >= pivot) ;
            if (i < j) intArray[i] = intArray[j];

            while (i < j && intArray[++i] <= pivot) ;
            if (i < j) intArray[j] = intArray[i];
        }

        intArray[j] = pivot;
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
          If element is larger than pivot then stop the iteration and put the element to Ith index
        - now start from ith + 1 index and traverse forward the same array. compare each element with pivot
          If element is smaller than pivot then stop the iteration and put the element to Jth index
        - stop the iteration when ith crosses jth index
        - swap the pivot to Jth index this will put the pivot in right position of the array

 */

// Other approach
//      @Override
//    public int[] sort() {
//        System.out.println(Arrays.toString(array));
//        Quick(array, 0, array.length - 1);
//        System.out.println(Arrays.toString(array));
//        return array;
//      }
//
//    private void Quick(int[] array, int lowIndex, int highIndex) {
//        if (lowIndex >= highIndex ) return;
//        int partition = array[highIndex];
//        int lPointer = lowIndex, rPointer = highIndex;
//        while (lPointer < rPointer){
//            while (lPointer < rPointer && array[lPointer] <= partition){
//                lPointer++;
//            }
//            while (lPointer < rPointer && array[rPointer] >= partition){
//                rPointer--;
//            }
//            swap(array, lPointer, rPointer);
//        }
//        swap(array, lPointer, highIndex);
//        Quick(array, lowIndex, lPointer-1);
//        Quick(array, lPointer+1, highIndex);
//    }
//
//    private void swap(int[] array, int l, int r)
//          int temp = array[l];
//          array[l] = array[r];
//          array[r] = temp;
//    }