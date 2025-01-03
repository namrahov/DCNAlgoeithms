package recursion.fibonacci;

public class MainFibonacciRecursion {

    public static void main(String[] args) {
        System.out.println(fibonacciRecursion(4));
    }


    public static int fibonacciRecursion(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }
}
