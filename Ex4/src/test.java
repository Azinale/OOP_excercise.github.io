import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        System.out.println("Nhap cac phan tu cho mang: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < b.length; i++) {
            b[i]=1;
        }
        countSame(a,b);
    }

    public static int[] countSame(int[] a, int[] b){
        for (int i = 0; i < a.length; i++) {
            int count = 1;
            //1 2 4 5 6 1 2
            //2 2 1 1 1 0 0
            for (int j = i+1; j < b.length; j++) {
                if (a[i]==a[j]){
                    count++;
                    b[j]=0;
                }
            }
            if (b[i]!=0){
                b[i]=count;
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i]>0){
                System.out.println("So " +a[i]+" xuat hien "+b[i]+" lan");
            }
        }
        return b;
    }
}
