package hackerrank;

import java.io.*;
public class DrawingBook {
    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static int pageCount(int n, int p) {
        // Write your code here
        int turns = 0;
        int front=1; int back=n;

        if(p==1 || p==n || (n%2!=0 && p == n - 1)) return 0;
        if(n%2==0) back++;
        while(true){
            front+=2;
            back-=2;
            turns++;
            if(front == p || front - 1 == p || back == p || back - 1 ==p) break;
        }
        return turns;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
