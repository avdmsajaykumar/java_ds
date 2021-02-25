package ds.Arrays.sorting;

import java.util.Arrays;

public class BubbleSort {

    //Stable if comparision is only > or <
    // if we use >= or <= while comparision it will become unstable
    public int[] sort() {
        int[] intarray = {2, 4, 73, 12, 3, 65, 341, 0, -21};
        System.out.println(Arrays.toString(intarray));

        for (int lastElement = intarray.length - 1; lastElement > 0; lastElement--) {
            for (int i = 0; i < lastElement; i++) {
                if (intarray[i] > intarray[i + 1]) {
                    int temp = intarray[i];
                    intarray[i] = intarray[i + 1];
                    intarray[i + 1] = temp;
                }
            }
        }

        return intarray;
    }

}
