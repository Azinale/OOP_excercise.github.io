import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong n: ");
        int n = reader.nextInt();
        reader.close();
        System.out.println("Tinh bang de quy, so Fibonacci thu " + n + " " + computeFibonacci(n));
        System.out.println("Khong de quy, So fibonacci thu " + n + " " + fibonacci(n));

    }

    public static int computeFibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return computeFibonacci(n - 1) + computeFibonacci(n - 2);
    }

    public static int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;

        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }
}
