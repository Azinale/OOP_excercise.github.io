import java.util.Scanner;
public class Statistic{
    
    // Hoàn thiện phương thức readArray thực hiện nhập và trả lại mảng a theo hướng dẫn sau:
    // 1. Nhập vào kích thước mảng là số nguyên dương n
    // 2. Khai báo mảng số nguyên a có kích thước n
    // 3. Nhập vào n số nguyên cho mảng a
    // 4. trả lại kết quả của hàm là mảng a (return a)
    public static int[] readArray(Scanner reader)
    {
      int n = reader.nextInt();
      int array[] = new int[n];
      for (int i =0; i<n;i++){
          array[i]=reader.nextInt();
      }
      return array;
    }
    // Hoàn thiện phương thức mean, thực hiện tính kỳ vọng (trung bình) của mảng array
    // 1. Tính tổng các http://mim.hus.vnu.edu.vn/mimgo/mod/vpl/forms/edit.php?id=4423&userid=2518#phần tử trong mảng (sum)
    // 2. Tính giá trị trung bình bằng sum chia cho số phần tử, chú ý giá trị trung bình là số thực
    public static double mean(int[] array)
    {
        double mean=0;
        double sum=0;
        for (int i=0; i<=array.length-1;i++){
            sum+=array[i];
        }
        mean = sum/array.length;
        return mean;
    }
    // Hoàn thiện phương thức variance thực hiện tính phương sai của mảng a
    // 1. Tính tổng bình phương của (từng giá trị trong mảng array - mean(array),
    //    chú ý nên đặt 1 biến lưu giá trị mean(array) để tránh phải tính lại nhiều lần.
    // 2. Chia tổng này cho số phần tử trong mảng array, chú ý phương sai là số thực
    public static double variance(int[] array)
    {
        double v =0;
        double s = 0;
        for(int i =0; i<array.length-1;i++){
            s+=Math.pow((array[i]-mean(array)),2);
        }
        v=s/array.length;
        return v;
    }
    
    // Hàm main được viết sẵn, sinh viên không cần viết, chỉnh sửa, 
    // tuy nhiên chương trình chỉ chạy đúng nếu các phương thức trên sinh viên làm đúng
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int[] array = readArray(reader);
        System.out.printf("%.3f\n",mean(array));
        System.out.printf("%.3f",variance(array));
    }
    
    
}
