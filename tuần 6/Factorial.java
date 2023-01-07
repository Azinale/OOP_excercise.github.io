import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        int n = reader.nextInt();
        System.out.println("Giai thua cua so " + n + " bang de quy la: " + factorial(n));
        System.out.println("Giai thua cua so " + n + " khong de quy: " + factorialCount(n));
        reader.close();

    }

    public static int factorial(int n) {
        int factor = 1;
        if (n == 0 || n == 1) {
            return factor;
        } else {
            for (int i = 2; i <= n; i++) {
                factor *= i;
            }
            return factor;
        }
    }

    public static int factorialCount(int n) {
        if (n > 0) {
            return n * factorialCount(n - 1);
        } else {
            return 1;
        }
    }
}
