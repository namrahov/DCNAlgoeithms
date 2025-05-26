package leeetcode.array;

public class xzxz {
    public static void main(String[] args) {
        System.out.println(factorial(4, 1));
    }

    public static int factorial(int n, int a) {


        if (n == 1) {
            return 1;
        }

        return a * factorial(n -1, a * n);
    }
}
