package string;

import java.util.HashMap;
import java.util.Map;

public class DisappearedNumber {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 1, -5};
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], arr[i]);
        }

        for (int i = 1; i <= arr.length; i++) {
            if (map.get(i) == null) {
                System.out.println(i);
            }
        }

    }
}
