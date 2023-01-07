import java.util.Scanner; 
public class KiemtraMatran{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrixA = inputMatrix(sc, n);
        if (ktraMatran(matrixA)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    public static int[][] inputMatrix(Scanner sc, int n){
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }
    public static boolean ktraMatran(int[][] matrixA){
        int temp = 0;
        for (int k = 1; k <= (matrixA.length*matrixA.length); k++){
            for (int i = 0;  i < matrixA.length; i++){
                for (int j = 0; j < matrixA[0].length; j++){
                    if (matrixA[i][j] == k){
                        temp++;
                        break;
                    }
                }
            }
        }
        if(temp == (matrixA.length*matrixA.length)){
            return true;
            
        }
        return false;
        
    }
}
