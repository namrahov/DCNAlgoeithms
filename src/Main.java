//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printFibo(10);
    }

    public static void printFibo(int n) {
        int k1 = 1;
        int k2 = 1;

        System.out.println(k1);
        System.out.println(k2);

        for (int i = 2; i < n; i++) {
            System.out.println(k1 + k2);
            int temp = k2;
            k2 = k1 + k2;
            k1 = temp;
        }
    }

}