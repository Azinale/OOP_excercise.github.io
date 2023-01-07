import java.util.Scanner;
public class Test2 {
    public static void main(String[] args){
        int[] elems = new int[500];
        int size, value, idx, oldValue, newValue;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua day:");
        size = scan.nextInt();
    
        ListOfNumbers2.inputList(elems, size);
        System.out.println("Nhap mot so nguyen:");
        value = scan.nextInt();
        
        size = ListOfNumbers2.remove(elems, size, value);
        System.out.println("\nDay so sau khi da xoa phan tu "+value+" xuat hien dau tien la:");
        ListOfNumbers2.printList(elems, size);    
        
        if(ListOfNumbers2.indexOf(elems, size, value) == -1){
           size = ListOfNumbers2.add(elems, size,size/2, value*2);
            System.out.println("\nDay so sau khi da them phan tu "+2*value+" vao giua la:");
            ListOfNumbers2.printList(elems, size);
        }
        else{
            ListOfNumbers2.replace(elems, size, value, value*2);
            System.out.println("\nDay so sau khi da nhan doi cac phan tu "+value+" la:");
            ListOfNumbers2.printList(elems, size);
        }  
    }
     
    
    
}
