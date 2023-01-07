import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = input(sc);

        if (increasingSequence(array)) {
            System.out.println("Day la day tang");
        }
        if (decreasingSequence(array)){
            System.out.println("Day la day giam");
        }
        if ( monotonicSequence(array) == true) {
            System.out.println("Day la day don dieu");
        }
        arithmeticSequence(array);
        System.out.println("");
        geometricSequence(array);
    }

    public static int[] input(Scanner sc) {
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        System.out.print("Nhap phan tu mang: ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();

        }
        return array;
    }

    public static boolean increasingSequence(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;

    }

    public static boolean decreasingSequence(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }

        }
        return true;

    }

    public static boolean monotonicSequence(int[] array) {
        if (decreasingSequence(array) == true || increasingSequence(array) == true) {
            return true;
        }
        return false;


    }


    public static void arithmeticSequence(int[] array) {
        int difference = array[1] - array[0];
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (difference != array[i + 1] - array[i]) {
                count++;
            }

        }
        if (count == 0) {
            double sum = ((double) ((array[array.length - 1] + array[0]) / 2)) * array.length;
            System.out.println("Day la cap so cong co tong la: " + sum);
            System.out.printf("(%d + %d)/2*%d = %.2f", array[0], array[array.length - 1], array.length, sum);

        } else {
            System.out.println("Khong la cap so cong ");
        }


    }


    public static void geometricSequence(int[] array) {
        double ratio =(double)array[1] /(double)array[0];
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (ratio != (double) array[i+1] / array[i]) {
                count++;
            }
        }
        if (count == 0) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];

            }
            System.out.println("Day la cap so nhan co tong la: " + sum);


        }
        else {
            System.out.println("Khong la cap so nhan");
        }


    }
    public static boolean constantSequence(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            if (array[i]!=array[i+1]){
                return false;
            }
        }
        return true;
    }

}
