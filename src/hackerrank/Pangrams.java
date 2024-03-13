package hackerrank;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Pangrams {

    public static String pangram(String s) {
        // Write your code here
        Set<Character> chars = new HashSet<>();
        s =s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') continue;
            chars.add(s.charAt(i));
        }

        return chars.size() == 26 ? "pangram" : "not pangram";

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = pangram(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
