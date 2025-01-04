package array.twoproductsmax;

public class MaxTwoProducts {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 11, 16, 10};

        System.out.println(maxTwoProducts(arr));
    }

    public static int maxTwoProducts(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] <= max1 && arr[i] >= max2) {
                max2 = arr[i];
            }
        }

        return max1 * max2;
    }
}
