import java.util.Scanner;

public class ListOfNumbers1 {

    public static void inputList(int[] elems) 
{
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < elems.length; i++) {
        elems[i]=sc.nextInt();
    }
}


public static void printList(int[] elems) 
{
    for (int i = 0; i < elems.length; i++) {
        System.out.println(elems[i]);
    }
}

public static int indexOf(int[] elems, int value) 
{
    for (int i = 0; i < elems.length; i++) {
        if (elems[i]==value) {
            return i;     
        }
    }return-1;
}


public static void replace(int[] elems, int oldValue, int newValue) 
{
    for (int i = 0; i < elems.length; i++) {
        if (elems[i]==oldValue) {
            elems[i] = newValue;
        }
    }
}


public static int[] add(int[] elems, int idx, int value) 
{
    int[] newElems = new int[elems.length + 1];
    for (int i = 0; i < idx; i++) {
        newElems[i]=elems[i];
    }
    newElems[idx]=value;
    for (int i = idx; i < newElems.length; i++) {
        newElems[i]=elems[i-1];
    }return newElems;
    
}   


public static int[] remove(int[] elems, int value) 
{
    if (indexOf(elems, value)==-1) {
        int[] newElems = elems;
        return newElems;
    }
    else{
        int[] newElems = new int[elems.length -1];
        int lc = indexOf(elems, value);
        for (int i = 0; i < lc; i++) {
            newElems[i]=elems[i];
        }
        for (int i = lc; i < newElems.length; i++) {
            newElems[i] = elems[i+1];
        }return newElems;
    }
}


}
