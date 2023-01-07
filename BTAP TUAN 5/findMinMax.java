import java.util.*;
public class findMinMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("So phan tu trong mang");
		int n = sc.nextInt();
		System.out.println("nhap phan tu cho mang");
		int[] a = new int[n];
		for(int i = 0; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(min(sc,n,a) + " " + max(sc,n,a));
		System.out.println(average(a,n,sc));
	}
	public static int min(Scanner sc, int n, int[] a) {
		int mina = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			if(mina > a[i]) {
				mina = a[i];
			}
		}
		return mina;
	}
	public static int max(Scanner sc, int n, int[] a) {
		int maxa = Integer.BYTES;
		for(int i = 0; i < n; i++) {
			if(maxa < a[i]) {
				maxa = a[i];
			}
		}
		return maxa;
	}
	public static double average(int[] a, int n, Scanner sc) {
		double sum = 0;
		for(int i = 0; i < n; i++) {
			sum += a[i];
		}
		double sumTB = Math.round(((sum/n) * 100.0))/100.0;
		return sumTB;
	}
}
