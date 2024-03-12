package Interview.epam;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortString {

    public static void main(String[] args) {
        String[] input = new String[]{"This", " ", "is",
                "Ajay", "kumar", "     ", "husbanD",
                "of", "  ", "yaSHu"};
        StringBuilder sb = new StringBuilder();
        String response = Arrays.stream(input).filter(x -> ! "".equals(x.trim()))
                .map(x ->  x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase())
                .sorted().collect(Collectors.joining("-"));

        System.out.println(response);
    };
}
