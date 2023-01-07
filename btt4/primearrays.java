import java.util.Scanner;

public class primearrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu cua arr");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("nhap cac phan tu cho arr");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        ouput(arr);
    }

    public static boolean isPrimeNumber(int n) {
        for (int i = 0; i < n; i++) {

            if (n < 2) {
                return false;
            }
            // check so nguyen to khi n >= 2
            int squareRoot = (int) Math.sqrt(n);
            for (int j = 2; j <= squareRoot; i++) {
                if (n % i == 0) {
                    return false;
                }
            }

        }
        return true;

    }

    public static int[] ouput(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrimeNumber(arr[i])) {
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println(count);
        return arr;
    }

}
