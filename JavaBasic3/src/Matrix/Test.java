package Matrix;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.print("Enter the rows of matrix: ");
        int rows = 5;
        System.out.print("Enter the columns of matrix: ");
        int cols = 6;
        int[][] matrix = new int[rows][cols];
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        Matrix.createRandomMatrix(matrix);
        Matrix.print(matrix);
        System.out.println(Matrix.haveSameDimension(matrix1,matrix2));
        System.out.println();
        Matrix.createRandomMatrix(matrix1);
        Matrix.createRandomMatrix(matrix2);
        Matrix.print(Matrix.add(matrix1,matrix2));
        System.out.println();
        Matrix.print(Matrix.multiply(matrix1,matrix2));
        Matrix.print(Matrix.subtract(matrix1,matrix2));
    }
}
