import java.util.Scanner;

public class Exponent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int exp = sc.nextInt();
        System.out.println(base + " raises to the power of 4 is: " + exponent(base, exp));
    }

    public static int exponent(int base, int exp) {
        int expValue = 1;
        for (int i = 0; i < exp - 2; i++) {
            expValue *= base;
        }
        return expValue;
    }
}
