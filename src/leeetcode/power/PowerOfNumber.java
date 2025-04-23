package leeetcode.power;

public class PowerOfNumber {

    public static void main(String[] args) {
        double x = 5;
        int pow = -3;
        double res = 1.0;

        int originalPow = pow; // keep track of sign
        if (pow < 0) {
            pow = -pow;
        }

        while (pow > 0) {
            if (pow % 2 == 1) {
                res *= x;
                pow--;
            }
            x *= x;
            pow /= 2;
        }

        // If the original exponent was negative, take reciprocal
        if (originalPow < 0) {
            res = 1.0 / res;
        }

        System.out.println(res);
    }
}
