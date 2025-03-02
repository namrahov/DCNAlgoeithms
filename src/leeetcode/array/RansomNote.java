package leeetcode.array;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {
        String str = "bad";
        String magazine = "abcd";

        Map<Character, Integer> magazineMap = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            magazineMap.put(ch, i);
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!magazineMap.containsKey(ch)) System.out.println("Not Found");
        }
    }
}
