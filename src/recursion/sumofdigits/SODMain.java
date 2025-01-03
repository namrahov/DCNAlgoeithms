package recursion.sumofdigits;

public class SODMain {
    public static void main(String[] args) {
        int n = 23;


        System.out.println(findSumOfDigits(n));
    }

    private static int findSumOfDigits(int n) {
        if (n == 0) return 0;
        return n % 10 + findSumOfDigits(n / 10);
    }
}
