package hackerrank;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class CamelCase4 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            String out;
            String input = scanner.nextLine();
            String[] split = input.split(";");
//            Arrays.stream(split).forEach(System.out::println);
            switch (split[0]) {
                case "S" -> out = split(split);
                case "C" -> out = combine(split);
                default -> {
                    return;
                }
            }
            System.out.println(out);
        }
    }

    static String split(String[] in){
        StringBuilder out = new StringBuilder();
        if(in[1].equals("M")) in[2] = in[2].substring(0, in[2].length() - 2);
        byte[] bytes = in[2].getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < bytes.length; i++) {
            if(bytes[i] >= 65 && bytes[i] <=90){
                bytes[i] += 32;
                if(i!=0) out.append(" ");
            }
            out.append((char) bytes[i]);
        }

        return out.toString();
    }
    static String combine(String[] in){
        String[] words = in[2].split(" ");
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < words.length; i++) {

            if(i == 0 && (in[1].equals("V")||in[1].equals("M"))){
                out.append(words[i]);
            }else {
                out.append(words[i].substring(0, 1).toUpperCase()).append(words[i].substring(1));
            }
        }
        if (in[1].equals("M")) out.append("()");
        return out.toString();
    }
}
