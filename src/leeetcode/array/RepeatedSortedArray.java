package leeetcode.array;

import java.util.Arrays;

public class RepeatedSortedArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 4, 4, 6, 7, 7, 7, 7};
        System.out.println(Arrays.toString(repeatedSortedArray(arr)));

    }

    public static int[] repeatedSortedArray(int[] arr) {
        int left = 0;
        int right = 1;

        while (right < arr.length) {
            if (arr[right] != arr[left]) {
                left++;
                arr[left] = arr[right];
            }

            right++;
        }

        return Arrays.copyOf(arr, left + 1);
    }
}
