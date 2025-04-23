package leeetcode.palindromnumber;

public class PalindromNumber {
    public static void main(String[] args) {
        int x = 33233;
        int res = 0;

        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }

        System.out.println(res);
    }
}
