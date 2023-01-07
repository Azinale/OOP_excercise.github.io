import java.util.Scanner;
public class NhiPhan{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap so nguyen n");
        int n = sc.nextInt();
        sc.close();
        String str= "";
        vongLap(n, str);
        int count = 0 ;
        deQuy(n, count);
    }
    public static void vongLap(int n, String str){
        while(n>0){
            str = (n%2)+str;
            n = n/2;
        }
        System.out.println(str);
    }
    public static void deQuy(int n, int count){
        if(n!=0){
            deQuy(n/2, count);
            count=n%2;
        }
        System.out.print(count);
    }
}
