public class Function {
		
	public static int sum(int[] a)
	{
	
	    int sum = 0;
	    for (int i = 0; i < a.length; i++){
	        sum += a[i];
	    }
		return sum;
	}	
	
	public static int maxOdd(int[] a)
	{
	    int max=-1, index=0;
	    for (int i = 0; i < a.length; i++){
	        if (a[i]%2 == 1){
	            max = a[i];
	            index = i;
	            break;
	        }
	    }
	    if( max != -1 ){
    	    for (int i = index; i < a.length; i++){
    	        if (a[i]%2 == 1){
    	            if(a[i] > max){
    	                max = a[i];
    	            }
    	        }
    	    }
	    }
		return max;
	}
	
	public static int minEven (int[] a)
	{
	    int min = -1, index = 0;
	    for (int i = 0; i < a.length; i++){
	        if (a[i]%2 == 0){
	            min = a[i];
	            index = i;
	            break;
	        }
	  
	    }
	    for (int i = index; i < a.length; i++){
	        if (a[i]%2 == 0){
	            if (a[i] < min){
	                min = a[i];
	            }
	        }
	    }
		return min;
	}
		
	public static boolean isCharContain(String s)
	{
	    
	    for (int i = 0; i < s.length(); i++){
	        for (int j =1; j < 10; j++){
	            
	            char c = (char) j;
	            if(s.charAt(i) != c){
	                return true;
	            }
	        }
	    }
		return false;
	}
		
	public static boolean isNumContain(String s)
	{
	    
	    for (int i = 0; i < s.length(); i++){
	        for (int j =1; j < 10; j++){
	            
	            char c = (char) j;
	            if(s.charAt(i) == c){
	                return true;
	            }
	        }
	    }
		return false;
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		System.out.println("Tong cac phan tu trong mang la: "+sum(a));
		
		System.out.println("So le lon nha la: "+maxOdd(a));
		
		System.out.println("So chan mho nha la: "+minEven(a));
		
		String s = "a123abcbsbasdcaac3ABCXaxddsa";
		
		if(isCharContain(s))
			System.out.println("Xau co chua chu cai");
		else
			System.out.println("Xau khong chua chu cai");
		
		if(isNumContain(s))
			System.out.println("Xau co chua chu so");
		else
			System.out.println("Xau khong chua chu so");
		
		
	}

}
