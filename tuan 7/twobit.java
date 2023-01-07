import java.util.Scanner;

public class twobit {

    public static void bit1(int n, String str) {
        int bit=0;
        while (n>0) {
            bit = (n%2);
            str +=bit;
            n/=2;   
        }
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.reverse().toString());
    }


    public static void bit2(int n, String str1) {
        int count=0;
        if (n!=0) {
            bit2(n/2, str1);
            count=n%2;
            str1+=count;
        }  
        System.out.print(str1); 
    }


   public static void main(String[] args) {
       String str ="", str1 ="";
       Scanner sc = new Scanner(System.in);
       System.out.println("nhap n: ");
       int n = sc.nextInt();
       sc.close();
       System.out.print("sau khi da chuyen sang so nhi phan la: ");
       bit1(n, str);
      System.out.print(" sau khi chuyen sang dang nhi phan bang de quy la : ");
      bit2(n, str1);
   } 
}
