import java.util.Scanner;

public class TransMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = sc.nextInt();
        int[][] array = new int[n][n];
        System.out.println("nhap cac phan tu cho matrix: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        matrixTransp(array);
        sc.close();
    }

    public static int[][] printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return array;
    }

    public static int[][] matrixTransp(int[][] array) {
        int temp = 0;
        int temp2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == 0) {
                    temp = i;
                    temp2 = j;
                }
            }
        }
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length ; j++) {
                array[temp][j] = 0;
                array[i][temp2] = 0;
            }
        }
        printArray(array);
        return array;
    }
}
