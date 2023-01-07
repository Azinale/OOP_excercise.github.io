import java.util.Arrays;

public class sortname {
    public static void main(String[] args) 
    {
        String[] names = new String[4];
        names[0] = "tran long";
        names[1] = "le long";
        names[2] = "vu dang";
        names[3] = "ha hieu";
        System.out.println("truoc khi sap xep: " );
        printSort( names );
        sort( names );
        System.out.println("sau khi sap xep: ");
        printSort(names);
    }

    public static void sort(String[] names) {
       Arrays.sort(names, (fullname, othername)->{
            var name1  = fullname.substring(fullname.indexOf(" ")+1);
            var name2  = othername.substring(othername.indexOf(" ")+1);
            var compare = name1.compareTo(name2);
           
            return compare;
            
        });
        
    }
    public static void printSort(String[] names){
            for(var e : names){
                System.out.println(e);
            }
    }
}

