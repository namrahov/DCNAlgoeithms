package string;

import java.util.HashMap;
import java.util.Map;

public class NSum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int x = 10;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], arr[i]);
        }

        for (int num : arr) {
            int complement = x - num;
            if (map.containsKey(complement) && num <= complement) {
                System.out.println(num + " + " + complement + " = " + x);
            }
        }


    }
}
