import java.util.Scanner;

/**
 * Fibonacci
 */
public class Fibonacci {
    static int n1 = 0, n2 = 1, n3 = 0;
public static void fibo(int count) 
{ 
    if (count > 0 ) {
        n3 = n2+n1;
        n1=n2;
        n2=n3;
        System.out.println(" "+n3);
        fibo(count-1);
    }
}
public static void fibofor(int n) 
{
   int f1 = 0;
   int f2 = 1;
   int f = 1;
   if (n==1||n==0) {
       System.out.println(n);
   } else  {
       

       for (int i = 2; i < n -1; i++) {
        f1 = f2;
         f2 = f;
         f = f1 + f2;
         System.out.println(f);
        }   
   }
}

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
     fibo(count-2);
     int n = sc.nextInt();
     fibofor(n);
     sc.close();
    }


}
