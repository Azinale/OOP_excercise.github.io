import java.util.Scanner;
public class InRaSoNTtrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            if(isNT(arr[i])){
                System.out.println(arr[i] + " ");
            }
        }
        sc.close();
    }
    public static boolean isNT(int n){
        int a = 0;
        if(n == 2){
            return true;
        }
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

}

