package hackerrank;

import java.util.Scanner;
import java.util.Stack;

public class Braces {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String stream = scanner.nextLine();
        System.out.println(isFormatted(stream));
    }

    private static String isFormatted(String stream) {
        char[] input = stream.toCharArray();

        int recentEncounteredOpen = -1;
        Stack<Integer> openBraces = new Stack<>();
        Stack<Integer> openFlowers = new Stack<>();


        for (int i = 0; i < input.length; i++) {

            if (input[i] == '(') {
                recentEncounteredOpen = i;
                openBraces.push(i);
            } else if (input[i] == '{') {
                recentEncounteredOpen = i;
                openFlowers.push(i);
            } else if (input[i] == ')') {
                if (!openBraces.isEmpty()) {
                    Integer prevBraceLocation = openBraces.peek();
                    if (prevBraceLocation == recentEncounteredOpen) {
                        recentEncounteredOpen = -1;
                        openBraces.pop();
                    } else if (
                            openFlowers.isEmpty() ||
                                    openBraces.size() >= openFlowers.size() && openBraces.peek() > openFlowers.peek()
                    ) {
                        openBraces.pop();
                        recentEncounteredOpen = -1;
                    } else {
                        return new String(input, openFlowers.peek(), input.length - openFlowers.peek()) + " is Unstable";
                    }
                } else {
                    return new String(input) + " is Unstable";
                }

            } else if (input[i] == '}') {
                if (!openFlowers.isEmpty()) {
                    Integer prevFlowerLocation = openFlowers.peek();
                    if (prevFlowerLocation == recentEncounteredOpen) {
                        recentEncounteredOpen = -1;
                        openFlowers.pop();
                    } else if (
                            openBraces.isEmpty() ||
                                    openFlowers.size() >= openBraces.size() && openFlowers.peek() > openBraces.peek()
                    ) {
                        openFlowers.pop();
                        recentEncounteredOpen = -1;
                    } else {
                        return new String(input, openBraces.peek(), input.length - openFlowers.peek()) + " is Unstable";
                    }
                } else {
                    return new String(input) + " is Unstable";
                }
            }
        }



        if (openFlowers.isEmpty() && openBraces.isEmpty()) {
            return "Stable Braces";
        } else {
            if (openBraces.isEmpty()) {
                return new String(input, openFlowers.peek(), input.length - openFlowers.peek());
            } else {
                return new String(input, openBraces.peek(), input.length - openBraces.peek());
            }
        }
    }
}
