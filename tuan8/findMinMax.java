import java.util.Scanner;
public class findMinMax{
    
    public static int findMin(int Array[]){
        //editing here
        int min = Array[0];
        for(int i = 0; i<Array.length;i++){
            if(Array[i]<min){
                min=Array[i];
            }
        }
        System.out.println(min);
        return min;
    }
    
    public static int findMax(int Array[]){
        //editing here
        int max = Array[0];
        for(int i =0; i<Array.length;i++){
            if(Array[i]>max){
                max=Array[i];
            }
        }
        System.out.println(max);
        return max;
    }
    
    public static void main(String args[]){
        // editing here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Array[]=new int[n];

        for (int i = 0; i < Array.length; i++) {
            Array[i]=sc.nextInt();
        }
        sc.close();

        findMin(Array);
        findMax(Array);
    }
}