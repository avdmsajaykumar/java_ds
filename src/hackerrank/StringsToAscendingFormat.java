package hackerrank;

public class StringsToAscendingFormat {

    String input = "Hello I'm Atmakuru Venkata Durga Maruthi Shanmuka Ajay Kumar.";
    public StringsToAscendingFormat() {
        System.out.println(Arrange.arrange(input));
    }

    public static void main(String[] args) {
        new StringsToAscendingFormat();
    }
}


class Arrange {

    /*
     * Complete the 'arrange' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING sentence as parameter.
     */

    public static String arrange(String sentence) {
        // Write your code here
        System.out.println(sentence);
        String output = "";

        if(sentence != null){
            int maxLength = 0;
            String[] words = sentence.split(" ");
            for (String s : words) {
                if (s.length() > maxLength) maxLength = s.length();
            }

            int templength = 1;
            while(templength<=maxLength){
                for (String s : words) {
                    String word = s;
                    word = word.toLowerCase();
                    word = word.replaceAll("\\.", "");

                    if (word.length() == templength) {
                        if (output.equals("")) {
                            output = word.substring(0, 1).toUpperCase() + word.substring(1);
                        } else {
                            output = output.concat(" " + word);
                        }
                    }
                }
                templength++;
            }

        }

        return output + ".";

    }

}