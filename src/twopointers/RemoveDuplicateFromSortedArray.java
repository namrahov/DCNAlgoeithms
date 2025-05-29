package twopointers;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int p1 = 0;

        for (int p2 = 1; p2 < arr.length; p2++) {
            if (arr[p1] != arr[p2]) {
                p1++;
                arr[p1] = arr[p2];
            }
        }

        // p1 + 1 is the length of the array without duplicates
        int[] result = Arrays.copyOfRange(arr, 0, p1 + 1);
        System.out.println(Arrays.toString(result));
    }
}
