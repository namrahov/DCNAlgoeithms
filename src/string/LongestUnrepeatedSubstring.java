package string;

import java.util.HashSet;
import java.util.Set;

public class LongestUnrepeatedSubstring {

    public static void main(String[] args) {
        String str = "pwwkew";
        int l = 0;
        int r = 0;

        Set<Character> set = new HashSet<>();

        int res = 0;
        while (r < str.length()) {
            char element = str.charAt(r);
            if (!set.contains(element)) {
                set.add(element);
                res = Math.max(res, r - l + 1);
                r++;
            } else {
                set.remove(str.charAt(l));
                l++;
            }
        }

        System.out.println(res);  // Output: wke

    }
}
