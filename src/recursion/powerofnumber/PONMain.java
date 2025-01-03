package recursion.powerofnumber;

public class PONMain {
    public static void main(String[] args) {
        int n = 3;
        int pow = 2;
        System.out.println(powerOfNumber(n, pow));
    }

    public static int powerOfNumber(int n, int pow) {
        if (pow == 0) return 1;
        if (pow == 1) return n;
        if (n == 0) return 0;
        return n * powerOfNumber(n, pow - 1);
    }
}
