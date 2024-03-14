package hackerrank;

import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class PermutingTwoArrays {
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        // Write your code here
        Collections.sort(A);
        B.sort(Collections.reverseOrder());
        for (int i = 0; i < A.size(); i++) {
            if(A.get(i)+B.get(i)< k) return "NO";
        }
        return "YES";

    }

    public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int q = Integer.parseInt(bufferedReader.readLine().trim());

            IntStream.range(0, q).forEach(qItr -> {
                try {
                    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                    int k = Integer.parseInt(firstMultipleInput[1]);

                    List<Integer> A = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                            .map(Integer::parseInt)
                            .collect(toList());

                    List<Integer> B = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                            .map(Integer::parseInt)
                            .collect(toList());

                    String result = twoArrays(k, A, B);

                    bufferedWriter.write(result);
                    bufferedWriter.newLine();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            bufferedReader.close();
            bufferedWriter.close();
    }
}
