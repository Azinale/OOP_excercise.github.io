import java.util.Scanner;
public class AddMatrix {
    
    public static int[][] inputMatrix(int m ,int  n, Scanner sc) {
      
        int[][] array = new int[m][n];
        for (int i = 0; i < m ; i++) {
           for (int j = 0; j < n; j++) {
               array[i][j]=sc.nextInt();
           }
        }return array;
    }
    public static void outputMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }System.out.println();
        }
    }
    
    //hàm tính tổng theo công thức C = 2A+3B
    public static int[][] add(int[][] matrix1, int[][]matrix2) {
        int[][] SumMatrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < SumMatrix.length; i++) {
            for (int j = 0; j < SumMatrix[0].length; j++) {
                SumMatrix[i][j]=2*matrix1[i][j]+3*matrix2[i][j];
            }
        }return SumMatrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
    
        
        int[][] A = inputMatrix(m,n, sc );
        int[][] B = inputMatrix(m,n, sc );
        sc.close();
        outputMatrix(add(A, B));
    }
}
