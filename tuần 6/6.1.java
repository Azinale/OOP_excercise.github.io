/**
 * Chương trình nhập một số nguyên n và mảng gồm n số nguyên
 * sau đó in ra giá trị nhỏ nhất và lớn nhất của mảng trên cùng dòng, 
 * cách nhau bởi một khoảng trống. Cần giữ khung chương trình.
 * */
//import <libraries needed here>

import java.util.Scanner;

public class FindMinMax {
    public static int findMin(int Array[]){
        //editing here
        int n = Array.length;
        int min = Array[0];
        for(int i = 1; i < n; i++ ){
            if ( min > Array[i] )
            min = Array[i];
        }
        return min;
    }

    
    
    public static int findMax(int Array[]){
        //editing here
        int max = Array[0];
        int n = Array.length;
        for(int i = 1; i < n; i++){
            if( max < Array[i]){
                max = Array[i];
            }
        }
        return max;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for ( int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findMin(arr) + " " + findMax(arr));

    }
    
}
