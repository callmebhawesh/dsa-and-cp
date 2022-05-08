// Factoria of Big integer

import java.math.BigInteger;

public class BigFactorial {
    public static void main(String[] args) {
        int N = 200;
        System.out.println(factorial(N));
    }

    static BigInteger factorial(int N) {
        BigInteger number = new BigInteger("1");
        for (int i = 2; i <= N; i++) {
            number = number.multiply(BigInteger.valueOf(i));
        }

        return number;
    }
}
