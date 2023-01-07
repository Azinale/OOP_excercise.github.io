import java.util.Scanner;

public class maxminarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu mang: ");
        int n = sc.nextInt();
        System.out.println("Nhap cac phan tu cua a: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        min(arr);
        max(arr);
        average(arr);

    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("gia tri nho nhat la: ");
        System.out.println(min);
        return min;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("hia tri lon nhat la: ");
        System.out.println(max);
        return max;
    }

    public static double average(int[] arr) {
        double average = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        average = sum / arr.length;
        System.out.println("gia tri trung binh la: ");
        System.out.println(average);

        return average;
    }

}
