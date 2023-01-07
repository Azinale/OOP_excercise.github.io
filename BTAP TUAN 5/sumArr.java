import java.util.*;
public class sumArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("So phan tu trong mang");
		int n = sc.nextInt();
		int[] A = new int[n];
		int[] B = new int[n];
		A = input(sc,n);
		B = input(sc,n);
		int[] C = sumArr(sc, n, A, B);
		output(sc, n, C);
	}
	public static int[] input(Scanner sc, int n) {	
		System.out.println("nhap phan tu cho mang");
		int[] a = new int[n];
		for(int i = 0; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		return a;
	}
	public static void output(Scanner sc,int n,int[] C) {
		for(int i = 0 ; i < n; i++ ) {
			System.out.print(C[i] + " ");
		}
	}
	public static int[] sumArr(Scanner sc, int n, int[] A, int[] B) {
		int[] c = new int[n];
		for(int i = 0; i < n ; i++) {
			c[i] = A[i] + B[i];
		}
		return c;
	}
}
