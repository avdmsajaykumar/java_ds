package hackerrank;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class LonelyInteger {

    public static int lonelyinteger(List<Integer> a) {
        if(a.size()==1) return a.get(0);
        Collections.sort(a);
        int i = 0;
        System.out.println(a);
        while(i < a.size()-1 && a.get(i).equals(a.get(i+1))){
            i+=2;
        }
        return a.get(i);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = lonelyinteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
