import java.util.Scanner;
public class tongday{
    static Scanner sc = new Scanner(System.in);

    public static Double sin(Double x,int n) {
        
        
        Double tich = x;
        Double sum = x;
        for (int i = 1; i <=n; i++){
    
            tich = tich * Math.pow(-1, n) * Math.pow(x,2) / ((2*i) * (2*i+1));
            sum += tich;
                        
        }
        return  Math.round(sum*1000.0)/1000.0;
    }
    public static void main(String[] args){
        
        Double x = sc.nextDouble();
        int n = sc.nextInt();
        
        System.out.println(sin((x*3.14)/180,n));
    }
}
