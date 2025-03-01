package leeetcode.longestunrepeatedstring;

import java.util.HashMap;
import java.util.Map;

public class LongestUnrepeatedString {

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestUS(s));
    }

    public static int longestUS(String s) {
        int lenght = 0;
        int left = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                map.remove(c);
                left++;
            }
            map.put(c, right);
            lenght = Math.max(lenght, (right - left + 1));
        }
        return lenght;
    }
}
