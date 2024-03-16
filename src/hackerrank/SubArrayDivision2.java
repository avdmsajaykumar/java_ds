package hackerrank;

import java.util.List;

public class SubArrayDivision2 {

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int count = 0 ;
        System.out.printf("d: %d, m: %d\n", d, m);
        for (int i = 0; i <= s.size() - m; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                System.out.printf("%d\t", s.get(i));
                sum+=s.get(i+j);
            }
            System.out.println("total sum: " + sum);
            if(sum==d) count = count+1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(birthday(List.of(1,2,1,3,2),3, 2));
    }
}
