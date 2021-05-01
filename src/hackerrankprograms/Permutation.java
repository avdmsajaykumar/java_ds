package hackerrankprograms;

public class Permutation {

    private String input;

    public Permutation(String input){
        this.input = input;
    }

    public void listAll(){
        perm(input, "");
    }

    private void perm(String in, String result){
        if (in.length() == 0) System.out.println(result);
        else {
            for (int i = 0; i < in.length(); i++) {
                char index = in.charAt(i);
                String restOfString = in.substring(0, i) + in.substring(i + 1);
                perm(restOfString, result + index);
            }
        }
    }

    public static void main(String[] args) {
        new Permutation("abcd").listAll();
    }

}
