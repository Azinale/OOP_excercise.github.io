public class DigitLength {

    public static void main(String[] args) {
        int n = 10;
        System.out.println(digitLength(n));
    }

    public static int numOfDigits(int n) {
        int len = 0;
        while (n > 0) {
            len++;
            n = n / 10;
        }
        return len;
    }

    public static int digitLength(int n) {
        if (n == 1) {
            return 1;
        }
        return digitLength(n - 1) + numOfDigits(n);
    }
}
