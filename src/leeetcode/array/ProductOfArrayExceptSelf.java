package leeetcode.array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] prefixProduct = new int[nums.length];
        int[] suffixProduct = new int[nums.length];

        prefixProduct[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefixProduct[i] = prefixProduct[i - 1] * nums[i - 1];
        }

        suffixProduct[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            suffixProduct[i] = suffixProduct[i + 1] * nums[i + 1];
        }

        int[] product = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            product[i] = prefixProduct[i] * suffixProduct[i];
        }

        System.out.println(Arrays.toString(product));
    }
}
