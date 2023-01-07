package ex1_1;

import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        String stringInt1 = "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111";
        String stringInt2 = "22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222";
        BigInteger bigInt1 = new BigInteger(stringInt1);
        BigInteger bigInt2 = new BigInteger(stringInt2);

        System.out.println(bigInt1);
        System.out.println(bigInt2);

        System.out.println(bigInt1.add(bigInt2));
        System.out.println(bigInt1.multiply(bigInt2));
    }
}
