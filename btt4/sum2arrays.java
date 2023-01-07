import java.util.Scanner;

/**
 * sum2arrays
 */
public class sum2arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu mang: ");
        int n = sc.nextInt();
        System.out.println("nhap cac phan tu mang a: ");
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("nhap cac phan tu mang b: ");

        int[] b = new int[n];
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        sc.close();

        int[] c = new int[n];
        System.out.println("mang c co gia tri la: ");
        sumarray(a, b, c);

    }

    public static int[] sumarray(int[] a, int[] b, int[] c) {

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
            System.out.print(c[i] + " ");
        }
        return c;

    }

}