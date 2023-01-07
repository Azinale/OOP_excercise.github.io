import java.util.Scanner;
public class test {
    public static boolean isDigit(String s) {
       
        for (int i =0; i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
            return true;
            }
            }
            return false;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(isDigit(s)==true){
            System.out.println("co chua so");
        }
        sc.close();
    }
}
