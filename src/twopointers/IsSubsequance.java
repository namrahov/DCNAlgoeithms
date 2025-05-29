package twopointers;

public class IsSubsequance {

    public static void main(String[] args) {
        String a = "abc";
        String b = "ahbgdc";

        System.out.println(isSubsequance(a, b));
    }

    public static boolean isSubsequance(String a, String b) {
        int p1 = 0;
        int p2 = 0;
        while (p1 < a.length() && p2 < b.length()) {
            if (a.charAt(p1) == b.charAt(p2)) {
                p1++;
                p2++;
            } else {
                p2++;
            }
        }

        return p1 == a.length();
    }
}
