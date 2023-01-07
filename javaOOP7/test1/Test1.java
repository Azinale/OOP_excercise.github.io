import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) 
{
    int[] elems, newElems;
    int size, value, idx, newValue, oldValue;

    Scanner sc = new Scanner(System.in);
    System.out.println("vui long nhap so phan tu o day");
    size = sc.nextInt();
    elems = new int[size];

    ListOfNumbers1.inputList(elems);
    System.out.println("nhap mot so nguyen");
    value = sc.nextInt();
                               
    elems = ListOfNumbers1.remove(elems, value);
    System.out.println("/n day so sau khi da xoa phan tu "+value+" xuat hien dau tien la: ");
    ListOfNumbers1.printList(elems);

    if (ListOfNumbers1.indexOf(elems, value) == -1) {
        elems = ListOfNumbers1.add(elems, elems.length/2, value*2);
        System.out.println("day la so sau khi da them phan tu "+2*value+" vao giua la: ");
        ListOfNumbers1.printList(elems);
    }else{
        ListOfNumbers1.replace(elems, value, value*2);
        System.out.println("day la so sau khi nhan doi cac phan tu "+value+" la:");
        ListOfNumbers1.printList(elems);
    }
}    

}
