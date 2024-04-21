package hackerrank;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class BetweenTwoSets {
        /*
         * Complete the 'getTotalX' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER_ARRAY a
         *  2. INTEGER_ARRAY b
         */

        public static int getTotalX(List<Integer> a, List<Integer> b) {
            // Write your code here
            Collections.sort(a); Collections.sort(b);
            // get the list of integers dividable by an array till first element of b
            List<Integer> dIntegers = new ArrayList<>();
            for (int i = 1; i <= b.get(0); i++) {
                boolean isDivisible = true;
                for (Integer integer : a) {
                    if (i % integer != 0) {
                        isDivisible = false;
                        break; // will remove if this is asked in test
                    }
                }
                if (isDivisible) dIntegers.add(i);
            }
            System.out.println(a + " " + b);
            System.out.println(dIntegers);
            // divide each b elements with elements find previously and remove them if not needed
            List<Integer> notFactorOfb = new ArrayList<>();
            for (Integer dInteger : dIntegers) {
                for (Integer integer : b) {
                    if (integer % dInteger != 0) {
                        notFactorOfb.add(dInteger);
                        break;
                    }
                }
            }
            for (Integer integer : notFactorOfb) {
                dIntegers.remove(integer);
            }
            System.out.println(dIntegers);
            return dIntegers.size();
        }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);
        System.out.println(n + " " + m);
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int total = getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
