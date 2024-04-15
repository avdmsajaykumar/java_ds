package hackerrank;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class MaxPerimeterTriangle {
    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        // Write your code here
        Collections.sort(sticks);
        List<Integer> output = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < sticks.size()-2; i++) {
            for (int j = i + 1; j < sticks.size()-1; j++) {
                // if(i==j) continue;
                for (int k = j + 1; k < sticks.size(); k++) {
                    // if(j==k || i==k) continue;
                    Integer s1 = sticks.get(i);
                    Integer s2 = sticks.get(j);
                    Integer s3 = sticks.get(k);
                    if (s1 + s2 > s3){
                        // System.out.println("basic " + s1 + " " + s2 + " " + s3);
                        if (s1 + s2 + s3 > max){
                            // System.out.println("max check " + s1 + " " + s2 + " " + s3);
                            output = Arrays.asList(s1, s2, s3);
                        }else if(s1 + s2 + s3 == max){
                            if(s1 > output.get(0)){
                                // System.out.println("min check " + s1 + " " + s2 + " " + s3);
                                output = Arrays.asList(s1, s2, s3);
                            }
                        }
                    }
                }
            }
        }
        return output.isEmpty() ? List.of(-1) : output;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        System.out.println(n);

        List<Integer> sticks = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = maximumPerimeterTriangle(sticks);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }




}
