package hackerrank;

import java.util.*;

public class FlippingMatrix {

    public static int flippingMatrix(List<List<Integer>> matrix) {
        // Write your code here
        int length = matrix.size();
        int sum = 0;
        for (int i = 0; i < matrix.size()/2; i++) {
            for (int j = 0; j < matrix.size()/2; j++) {
                List<Integer> temp = Arrays.asList(
                        matrix.get(i).get(j),
                        matrix.get(length - 1 - i).get(j),
                        matrix.get(i).get(length - 1 - j),
                        matrix.get(length - 1 - i).get(length - 1 - j)
                );
                Collections.sort(temp);
                sum+= temp.get(temp.size() - 1);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(flippingMatrix(
                Arrays.asList(
                        Arrays.asList(112, 42, 83, 119),
                        Arrays.asList(56, 125, 56, 49),
                        Arrays.asList(15, 78, 101, 43),
                        Arrays.asList(62, 98, 114, 108)
                )
        ));
    }
}
