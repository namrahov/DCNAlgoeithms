package string;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public static void main(String[] args) {

        String ransomNote = "abc";
        String magazine = "cdbaa";


        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char element = magazine.charAt(i);
            map.put(element, element);
        }

        int count = 0;
        for (int i = 0; i < ransomNote.length(); i++) {
            char element = ransomNote.charAt(i);
            if (map.get(element) != null) {
                count++;
            }
        }

        if(count == ransomNote.length()) {
            System.out.println(true);
        }
    }
}
