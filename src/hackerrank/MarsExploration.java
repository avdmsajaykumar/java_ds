package hackerrank;

import java.io.*;

public class MarsExploration {


    public static int marsExploration(String s) {
        // Write your code here
        int output = 0;
        for (int i = 0; i < s.length(); i+=3) {
            if(s.charAt(i) != 'S') output++;
            if(s.charAt(i+1) != 'O') output++;
            if(s.charAt(i+2) != 'S') output++;
        }
        return output;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
