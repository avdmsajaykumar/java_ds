package hackerrank;

import java.util.List;

public class DivisiblePairs {

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int output = 0;
        for (int i = 0; i < ar.size()-1; i++) {
            for (int j = i+1; j < ar.size(); j++) {
                if((ar.get(i) + ar.get(j)) % k == 0){
                    output++;
                }
            }
        }
        return output;
    }
}
