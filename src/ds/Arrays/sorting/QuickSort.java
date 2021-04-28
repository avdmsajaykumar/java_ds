package ds.Arrays.sorting;

public class QuickSort {

    int[] intarray = {2, 4, 73, 12, 3, 65, 341, 0, -21};

    public int[] sort(){
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

        while (i<j) {

            while (i < j && intarray[--j]>=pivot);
            if(i<j) intarray[i] = intarray[j];

            while (i < j && intarray[++i]<=pivot);
            if(i < j) intarray[j] = intarray[i];
        }

        intarray[j] = pivot;
        return j;
    }
}
