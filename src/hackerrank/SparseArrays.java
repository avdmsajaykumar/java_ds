package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SparseArrays {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        List<Integer> output = new ArrayList<>();
        for (String query : queries) {
            Integer found = 0;
            for (String string : strings) {
                if (string.equals(query)) {
                    found++;
                }
            }
            output.add(found);
        }
        return output;
    }

    public static void main(String[] args) {
        List<Integer> o = matchingStrings(
                Arrays.asList("aba","baba","aba","xzxb"),
                Arrays.asList("aba","xzxb","ab")
        );
        o.forEach(System.out::println);

    }
}
