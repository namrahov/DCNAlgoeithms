package string;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "bcda";

        if (str1.length() != str2.length()) {
            System.out.println(false);
            return;
        }

        Map<Character, Integer> countMap = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            countMap.put(str1.charAt(i), countMap.getOrDefault(str1.charAt(i), 0) + 1);
            countMap.put(str2.charAt(i), countMap.getOrDefault(str2.charAt(i), 0) - 1);
        }

        boolean isEqual = countMap.values().stream().allMatch(v -> v == 0);
        System.out.println(isEqual); // false in this case
    }

}
