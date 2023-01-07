/**
 * Baby
 */
    import java.util.Scanner;
    public class Baby {
      public static void main(String[] args) {
        //sử dụng class Scanner để lấy dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);
        sc.close();
        //khai báo biến a là số cần kiểm tra, sum là tổng các ước số của a
        int sum = 0, a;
        System.out.println("\n\nNhập vào số cần kiểm tra: ");
        a = sc.nextInt();
        for(int i=1;i<=a/2;i++){
          if(a%i==0) 
            //tổng các ước số của a
            sum+=i;
        }
        //nếu tổng ước số sum = a thì a là số hoàn hảo
        if(sum==a){
          System.out.println(a + " là số hoàn hảo");
        }
        //ngược lại không phải là số hoàn hảo
        else {
          System.out.println(a + " không phải là số hoàn hảo");
        }
     
        System.out.println("\n------------------------------------");
        System.out.println("Chương trình này được đăng tại Freetuts.net");
      }
    }
    
