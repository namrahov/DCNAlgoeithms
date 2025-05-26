package string;

public class LastWord {
    public static void main(String[] args) {
        String str = " The sky is blue  ";
        int r = str.length() - 1;

        // Skip trailing spaces
        while (r >= 0 && str.charAt(r) == ' ') {
            r--;
        }

        int l = r;

        // Find the start of the last word
        while (l >= 0 && str.charAt(l) != ' ') {
            l--;
        }

        // Extract and print the last word
        String lastWord = str.substring(l + 1, r + 1);
        System.out.println(lastWord);
    }
}
