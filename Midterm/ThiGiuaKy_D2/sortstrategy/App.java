package com.sortstrategy;


import java.util.Random;
public class App {
    public static void main(String[] args) {
        /* TODO */
        // Tạo một mảng các số tự nhiên, các số tự nhiên được sinh ngẫu nhiên
        Random random = new Random();
        int[] a = new int[7];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt();
        }
        // In ra mảng vừa tạo theo định dạng, ví dụ [1 2 3 4 5].

        for (int i = 0; i < args.length ; i++) {
            System.out.print( a[i] );
        }
        // Sắp xếp mảng theo thứ tự tăng dần sử dụng các thuật toán sắp xếp khác nhau.
        BubbleSort bb = new BubbleSort();
        System.out.println(bb.sort(a));
        // In ra mảng sau khi sắp xếp.
        // In ra số lần đổi vị trí trong thuật toán đang sử dụng.
        // Ví dụ:
        // Using Bubble Sort Algorithm:
        // Before sorting: [5 4 3 2 1]
        // After sorting: [1 2 3 4 5]
        // Number of swap: 10

        // Using Selection Sort Algorithm:
        // Before sorting: [5 4 3 2 1]
        // After sorting: [1 2 3 4 5]
        // Number of swap: 10

        // Kết quả chạy chương trình lưu vào file SortStrategy<Mã sinh viên>.txt và nộp cùng source code.
    }
}
