package string;

public class ReverseSentence {
    public static void main(String[] args) {

        String str = "Hello World";

        String[] words = str.split(" ");
        for (int i = words.length - 1; i >= 0 ; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
