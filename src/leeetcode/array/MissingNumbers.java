package leeetcode.array;

import java.util.HashSet;
import java.util.Set;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4, 7};
        int max = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            set.add(nums[i]);
        }

        for (int i = 1; i < max; i++) {
            if (!set.contains(i)) {
                System.out.println(i);
            }
        }
    }
}
