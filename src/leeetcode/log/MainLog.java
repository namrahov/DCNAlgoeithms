package leeetcode.log;

public class MainLog {
    public static void main(String[] args) {
        System.out.println(log(2, 8));
    }

    public static int log(int n, int k) {
        int count = 0;
        while (k >= n) {
            k = k / n;
            count++;
        }

        return count;
    }
}
