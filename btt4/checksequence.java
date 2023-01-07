import java.util.Scanner;

public class checksequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        if (IncreaseSequence(array) == true) {
            System.out.println("Day tang");
        }
        if (DecreaseSequence(array) == true) {
            System.out.println("Day giam");
        }
        if (ArithmeticSequence(array) == true) {
            System.out.println("Day la cap so cong");
        }

    }

    public static boolean IncreaseSequence(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean DecreaseSequence(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean ArithmeticSequence(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] == array[i - 1] + array[i - 2]) {
                System.out.println("dãy giảm");
                return true;
            }
        }
        return false;
    }

}
