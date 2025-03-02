package leeetcode.array;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        int numOfNonzero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[numOfNonzero++] = nums[i];
            }
        }

        for (int i = numOfNonzero; i < nums.length; i++) {
            nums[i] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }
}
