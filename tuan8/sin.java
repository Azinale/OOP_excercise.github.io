import java.util.Scanner;
public class sin {

    public static double sinx(double x, int n) {
        int a=1;
        if (n%2==0) {
            a= 1;
        }else{
            a=-1;
        } 
        double temp=1;
        for (int i = 1; i <= 2*n+1; i++) {
            temp=temp*x/i;
           
        }
        return  a* temp;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double sin = 0;
        int n=0;
        while (Math.abs(sinx(x,n))>0.00001) {
            sin+=sinx(x,n);
            n++;
        }
        sc.close();
        System.out.println(Math.sqrt(1-sin*sin));
    }
}
