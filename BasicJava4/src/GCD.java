public class GCD {

    public static void main(String[] args) {
        int a = 0, b = 10;
        System.out.println(gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
