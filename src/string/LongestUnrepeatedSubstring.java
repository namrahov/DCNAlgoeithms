package string;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestUnrepeatedSubstring {

    public static void main(String[] args) {
        String str = "pwwkew";
        int l = 0;
        int r = 0;

        Set<Character> set = new HashSet<>();
        String result = "";

        while (r < str.length()) {
            char element = str.charAt(r);
            if (!set.contains(element)) {
                set.add(element);
                r++;
                if (r - l > result.length()) {
                    result = str.substring(l, r);
                }
            } else {
                set.remove(str.charAt(l));
                l++;
            }
        }

        System.out.println(result);  // Output: wke

    }
}
