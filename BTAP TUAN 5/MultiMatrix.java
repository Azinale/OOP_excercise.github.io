package TwoDimensionArray;

import java.util.Scanner;

public class MultiMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] array1 = new int[rows][cols];
        int[][] array2 = new int[cols][rows];
        input(array1, array2);
        int[][] matrix = multiMatrix(array1,array2);
        System.out.println("Tich cua 2 ma tran la: ");
        printMaxtrix(matrix);
    }

    public static void input(int[][] array1, int[][] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                array1[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Ma tran thu 1 la: ");
        printMaxtrix(array1);
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                array2[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Ma tran thu 2 la: ");
        printMaxtrix(array2);
    }

    public static void printMaxtrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

    public static int[][] multiMatrix(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix2[0].length;
        int[][] newMatrix = new int[rows][cols];
        int sum = 0;
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix.length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    sum+=matrix1[i][k]*matrix2[k][j];
                }
                newMatrix[i][j]=sum;
                sum=0;
            }
        }
        return newMatrix;
    }

}
