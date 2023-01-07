import java.util.Scanner;
class NPerfects
{
    // Hàm kiểm tra số n có phải là số hoàn hảo hay không
    // nếu n là số hoàn hảo thì trả về true, ngược lại trả về false
    static boolean isPerfect(int n)
    {
        //begin edit
        int sum=0;
        for(int i =1;i<n/2;i++){
            if(n%i==0){
                sum+=i;
            }
            if(sum ==n){
            return true;
            }
        }return false;

        //end edit
        
    }
    // hàm in ra các số hoàn hảo nhỏ hơn n trên cùng dòng, ví dụ n = 100 kết quả in ra là:
    // 6 28
    
    static void printNPerfect(int n)
    {
        for (int i = 0; i < n; i++) {
            if (isPerfect(n)) {
                System.out.println(" "+i);
            }
        }
        
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPerfect(n);
        printNPerfect(n);
        sc.close();
    }
}
