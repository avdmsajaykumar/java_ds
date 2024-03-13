package hackerrank;

import java.io.*;

public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        // Write your code here
        int valleys = 0, sealevel = 0;
        for (int i = 0; i < steps; i++) {
            if(path.charAt(i) == 'U') {
                sealevel++;
            }
            if(path.charAt(i) == 'D') {
                if(sealevel == 0) valleys++;
                sealevel--;
            }
        }
        return valleys;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
