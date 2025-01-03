package recursion.decimaltobinary;

public class DTBMain {
    public static void main(String[] args) {
        int n = 34;
        System.out.println(decimalToBinary(n));
    }

    private static int decimalToBinary(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 2 + 10 * decimalToBinary(n / 2);
    }
}
