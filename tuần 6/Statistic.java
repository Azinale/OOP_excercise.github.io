package BTVN4;

import java.util.Scanner;

public class Statistic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = input(sc);
        System.out.printf("Gia tri trung binh cua mang la: %.3f \n",findAverage(array));
        System.out.printf("Phuong sai cua mang la: %.3f ", findVar(array));


    }

    public static int[] input(Scanner sc) {
        System.out.print("Nhap so nguyen duong n: ");
        int n = sc.nextInt();
        System.out.print("Nhap mang a gom " + n + " so nguyen: ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static double findAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        //System.out.print("Gia tri trung binh cua mang la: "+(double)sum/ array.length);
        return (double) sum / array.length;
    }

    public static double findVar(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += (array[i] - findAverage(array)) * (array[i] - findAverage(array));
        }
        return sum / array.length;

    }
}
