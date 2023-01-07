
import java.util.Scanner;

public class Bai2 {
    // nhap ma tran
	public static double[][] inputMatrix(Scanner reader){
	    int n = reader.nextInt();
	    double[][] array = new double[n][n];
	    for(int i =0; i<n; i++){
	        for(int j = 0; j<n;j++){
	            array[i][j]=reader.nextInt();
	        }
	    }
	    
	    
	    return array;
	    
	    
	}
    // kiem tra hang r1 va r2 co truc giao voi nhau khong

	public static boolean isTwoRowsOrthgonal(double a[][], int r1, int r2) {
	   double r = 0;
	   for(int i = 0; i <a.length; i ++){
	       r+=a[r1][i]*a[r2][i];
	   }
	   if(r!=0)return false;
	   return true;
	}
    // kiem tra trong ma tran co hai hang truc giao khong	
	public static boolean isRowsOrthgonal (double a[][]){
	   for(int i =0; i<a.length;i++){
	       for (int j =0; j<a.length;j++){
 	           if(isTwoRowsOrthgonal(a, i, j)){
	               return true;
	           }
	       }
	   }return false;
	}
	
	public static void main(String[] args) {
	}
}
 