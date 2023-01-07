import java.util.*;
public class countandPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("So phan tu trong mang");
		int n = sc.nextInt();
		System.out.println("nhap phan tu cho mang");
		int[] a = new int[n];
		for(int i = 0; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		int count = 0;
		for(int i = 0; i< n ; i++) {
			if(checkNT(a[i])) {
				System.out.println(a[i]);
				count++;
			}
		}
		System.out.println(count);
	}
	public static boolean checkNT(int k) {
	//	if(k <= 1) {
//			return false;
//		}
		for(int i = 2; i < k; i++) {
			if(k%i==0) {
				return false;
			}
		}
		return true;
	}
}
