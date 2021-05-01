package ds.Arrays.sorting;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Sort sort = new BubbleSort();
//        Sort sort = new SelectionSort();
//        Sort sort = new InsertionSort();
//        Sort sort = new MergeSort();
//        Sort sort = new QuickSort();

        System.out.println(Arrays.toString(sort.sort()));
    }
}
