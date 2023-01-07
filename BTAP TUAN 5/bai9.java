import java.uti.Scanner;
public class bai9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("So phan tu trong mang");
		int n = sc.nextInt();
		System.out.println("nhap phan tu cho mang");
		int[] a = new int[n];
		for(int i = 0; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		
		if(checkIncre(a, n)) {
			System.out.println("day chi tang");
			for(int i = 0 ; i < n; i++ ) {
				System.out.print(a[i] + " ");
			}
		}else {
			System.out.println("day ko tang ko giam");
		}
		System.out.println();
		if(check2(a, n)) {
			System.out.println("Day bien thien");
			for(int i = 0 ; i < n; i++ ) {
				System.out.print(a[i] + " ");
			}
		}else {
			System.out.println("day ko tang ko giam");
		}
		System.out.println();
		System.out.println(checkPlus(a));
		if(checkTimes(a)) {
			System.out.println("la cap so nhan");
			int timeAll = (a[0]*(1-(int)Math.pow((a[1]/a[0]), a.length)))/(1-(a[1]/a[0]));
			System.out.println(timeAll);
		}
	//	if(checkPlus(a, n)) {
	//		System.out.println("la cap so cong");
	//	}
	}
	public static boolean checkIncre(int[] a, int n) {
		for(int i = 0; i < n-1; i ++) {
			if(a[i]>=a[i+1]) {
				return false;
			}
		}
		return true;
	}
	public static boolean check2(int[] a, int n) {
		if(checkIncre(a, n)) {
			return true;
		}
		for(int i = 0; i < n-1; i ++) {
			if(a[i]<=a[i+1]) {
				return false;
			}
		}
		return true;
	}
	public static int checkPlus(int[] a) {
		int sum = 0;
		for(int i=0; i < a.length; i++) {
			sum = a[i]+sum;
		}
		if((a.length*(a[0]+a[a.length-1]))/2 == sum) {
			System.out.println("la cap so cong");
		}
		return sum;
	}
	public static boolean checkTimes(int[] a) {
		int q = a[1]/a[0];
		for(int i = 0 ; i < a.length-1;i++) {
				if((a[i]*q)!=a[i+1]) {
					return false;
				}
		}
		return true;
	}
}
