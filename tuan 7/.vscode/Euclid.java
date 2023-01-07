import java.util.Scanner;

public class Euclid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap p ");
        int p = sc.nextInt();
        System.out.println("nhap q");
        int q = sc.nextInt();
        int c = euclidfor(p, q);
        System.out.println("gcd bang vong lap "+ c);
       int d = euclidrec(p, q);
        System.out.println("gcd bang de quy " + d);

    }
    public static int euclidfor(int p, int q) {
       int temp;
       while (q!=0) {
           temp = p%q;
           p=q;
           q=temp;
       }return p;
    }
    public static int euclidrec(int p, int q) {
        if (q==0) {
            return q;
        }
        return euclidfor(q, p%q);
    }
}
   
