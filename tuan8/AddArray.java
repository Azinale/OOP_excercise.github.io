import java.util.Scanner;
 class AddArray{
     
     // hàm/phương thức SumArray trả về tổng 2 mảng nguyên A, B
     public static int[] input(Scanner sc, int n){
         int arr[]= new int[n];
         for (int i = 0; i<n; i++){
             arr[i]=sc.nextInt();
         }return arr;
         
     }
     public static int[] SumArray(int A[],int B[],int C[], int n){
         for(int i = 0; i<n; i++){
                 C[i]=A[i]+B[i];
         }return C;
     }
     // .....{.......}
     public static void printArray(int n,int C[]){
         for (int i = 0; i < n; i++) {
             System.out.print(C[i]+" ");
         }
     }
     
     // hàm/phương thức printArray để in một mảng A ra màn hình
     
     public static void main(String args[]){
         //editing
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int A[]= input(sc,n);
         int B[] =input(sc,n);
         sc.close();
         int[] C=new int[n];
         SumArray(A,B,C,n);
        printArray(n,C);
         
         
     }
 }
