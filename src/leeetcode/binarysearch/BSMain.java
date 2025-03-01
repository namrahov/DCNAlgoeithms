package leeetcode.binarysearch;

public class BSMain {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println(binarysearch(arr, 5));
    }

    public static int binarysearch(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k) {
                return mid;
            }
            if (arr[mid] < k) {
                low = mid + 1;
            }
            if (arr[mid] > k) {
                high = mid - 1;
            }
        }
        return -1;
    }
}
