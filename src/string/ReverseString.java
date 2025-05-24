package string;

public class ReverseString {
    public static void main(String[] args) {
        String str = "HelloWorld";
        StringBuilder sb = new StringBuilder(str);

        int p1 = 0;
        int p2 = str.length() - 1;

        while (p1 < p2) {
            char temp = sb.charAt(p1);
            sb.setCharAt(p1, sb.charAt(p2));
            sb.setCharAt(p2, temp);
            p1++;
            p2--;
        }

        System.out.println(sb); // Output: "dlroWolleH"

    }
}
