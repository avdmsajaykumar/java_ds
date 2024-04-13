package hackerrank;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MigratoryBirds {

        /*
         * Complete the 'migratoryBirds' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static int migratoryBirds(List<Integer> arr) {
            // Write your code here
            Map<Integer, Integer> birdsMap= new HashMap<>();
            for (int i = 1; i <= 5; i++) {
                birdsMap.put(i,0);
            }

            for (Integer integer : arr) {
                birdsMap.put(integer, birdsMap.get(integer)+ 1);
            }
            System.out.println(birdsMap);
            int outputIndex = 0, max=1;
            for (int i = 1; i <= birdsMap.size(); i++) {
                if(birdsMap.get(i) > max){
                    outputIndex = i;
                    max=birdsMap.get(i);
                }
            }
            return outputIndex;

        }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
        System.out.println(arrCount);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
