import java.util.Scanner;

public class NameProperty {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(getName(a));
        sc.close();
    }
    
    public static String getName(String str) {
        String name = str.trim().toLowerCase();
        name=name.replaceAll("\\s+", " ");
        String standName = "";
        String[] temp = name.split(" ");
        for (int i = 0; i < temp.length; i++) {
            standName+=String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i<temp.length -1) {
                standName = standName + " ";
            }
        }return standName;
    }

}
