package leeetcode.singlenumber;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {

        int[] nums = {4, 5, 1, 5, 2, 3, 4};
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer element = map.get(nums[i]);
            if (element == null) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], element + 1);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == 1) {
                System.out.println(nums[i]);
            }
        }


    }
}
