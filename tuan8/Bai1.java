import java.util.Scanner;

public class Bai1 {
	// nhap mang
	public static int[] inputArray(Scanner sc) {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	// dao nguoc mang
	public static int[] reverseArray(int[] arr) {
		int n = arr.length;
		int[] newarr = new int[n];
		for (int i = 0; i < n; i++) {
			newarr[i] = arr[n - i - 1];
		}
		return newarr;
	}

	// tim so
	public static int[] findNumbers(int[] arr) {
		int n = arr.length;
		int[] newarr = new int[n];
		int k = 0;

		for (int m = 0; m < n; m++) {
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (arr[i] + arr[j] == arr[m]) {
						newarr[k] = arr[m];
						k++;
						break;
					}
				}
			}
		}

		int[] result = new int[k];
		for (int i = 0; i < k; i++) {
			result[i] = newarr[i];
		}
		if (k == 0)
			return null;
		return result;
	}

	// tinh gia tri của đa thức
	public static int calPolynomial(int a[], int x) {
		int n = a.length;
		int sum = 0;
		int t = 1;
		for (int i = n - 2; i >= 0; i--) {
			t = x * t;
			sum += (int) a[i] * t;
		}
		return sum + a[n - 1];
	}

	public static void main(String[] args) {

	}
}
