package string;

public class ProductOfArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(product / arr[i] + " ");
        }
    }
}
