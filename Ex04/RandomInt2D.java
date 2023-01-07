public class RandomInt2D { 

	
	public static double meanArray(int[] array ){
		
		int so_luong = array.length;
		int sum_array = 0;
		
		for (int i = 0; i < so_luong ; i++){
			sum_array = sum_array + array[i];
			sum_array+=array[i];
		
		}	
			
		return (double)sum_array / so_luong;
	}
	
	
	
	public static int random(int n){
		
		double r = Math.random(); // tạo ra 1 số thực ngẫu nhiên x , 0 <= x < 1	 
	 	return (int) (r * n);
 
 }
	
    public static void main(String[] args) { 
        // a positive integer
		int n = Integer.parseInt(args[0]); // Nếu bây giờ tôi nhập n = 1000 thì hàm random sẽ
											//  sinh ra các số nguyên có thể là 0 đến 999
		int k = Integer.parseInt(args[1]);
		
		

		int[][] count = new int[n][500]; // đây là 1 mảng 2 chiều gồm có n mảng 1 chiều là mảng con
										// và mỗi mảng con có kích thước ( độ dài là 500 )
							/* 

							count[0] là để đếm số lần xuất hiện 0
							count[1] là để đếm số lần xuất hiện 1


							count[n] là để đếm số lần xuất hiện n 
						
							*/

		for (int i =0; i < n;i++){

			for (int j = 0; j < 500; j++){
				
				count[i][j] = 0;		
			}
		}
				
		for (int j = 0; j < 500; j++){
			
			for(int i=0; i<k; i++){

					int x = random(n); // nếu x = 0 thì biến đêm count[0] + thêm 1
										// nếu x = 1 thì biến đếm count[1] + thêm 1										// nếu x = 5 thì biến đếm count[5] + thêm 1
					count[x][j] += 1;   // random ra thằng nào thì biến đếm thằng đấy phải cộng thêm 1
										// count[0] lúc đến lên tận 5 
					
		}	
			
		}


		// bây giờ in ra giá trị trung bình của các mảng count[0], count[1],....
		double [] mean =  new double[n];

		for (int i = 0; i < n; i++){

			System.out.println( meanArray(count[i]) ); 
			
			// Gán giá trị vào mảng mean luôn

			mean[i] = meanArray(count[i]);
		
			/*
				i = 0 thì in ra giá trị trung bình của count[0]
				i = 1 thì in ra giá trị trung bình của count[1]
				i = 2 thì in ra giá trị trung bình của count[2] 		
			*/

		}

		for (int i =0; i < n; i++){

			System.out.println( mean[i] ); 

		}
			
    }
	// Gỉa sử nhập k = 10 thì đây là vòng lặp chạy 10
	
	
	
}