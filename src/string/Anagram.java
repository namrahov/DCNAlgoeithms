package string;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "bcda";

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        int maxLength = Math.max(str1.length(), str2.length());

        for (int i = 0; i < maxLength; i++) {
            if (i < str1.length()) {
                char c1 = str1.charAt(i);
                map1.put(c1, map1.getOrDefault(c1, 0) + 1);
            }

            if (i < str2.length()) {
                char c2 = str2.charAt(i);
                map2.put(c2, map2.getOrDefault(c2, 0) + 1);
            }
        }

        System.out.println(map1.equals(map2)); // false
    }

}
