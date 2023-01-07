import java.lang.reflect.Array;

/*************************************************
 * 
 *  Execution:    java RandomInt N k
 *  
 *  Prints k pseudo-random integers between 0 and N-1.
 * @version 1.0
 *
 **************************************************/
public class RandomInt { 

	/**
	* Print some pseudo-random integers in a given interval
	* @param args[0] determines the interval of each pseudo-random integer
	* @param args[1] gives the number of generated pseudo-random integers
	*/
    public static void main(String[] args) { 
        // a positive integer
		int count0 =0;
		int count1=0;
		int count2 =0;
		int n = 3;
		int k = Integer.parseInt(args[0]);	
		for(int i=0; i<k; i++){
			int a = random(n);
			if(a==0.0){
				count0=count0+1;
			}else if(a==1.0){
				count1++;
			}else if(a==2.0){
				count2++;
			}
		}System.out.println("so 0 la: "+count0);
		System.out.println("so 1 la: "+ count1);
		System.out.println("so 2 la: "+ count2);
	}
    public static double  meanArray(double[] array) {
        double num = array.length;
        double sum_array = 0;

        for (int i = 0; i < num; i++) {
            sum_array = sum_array + array[i];
			sum_array+=array[i];
        }return (double)sum_array / num;
    
    }
	/**
	* A function returning a pseudo-random integer 
	* @param n the upper bound of the generated pseudo-random number
	* @return a pseudo-random number less than @n 
	*/
	public static int random(int n){
		// a pseudo-random real between 0.0 and 1.0
       	
        double r = Math.random(); 
		// Explicit type conversion (cast) from double to int.
        // return a pseudo-random integer between 0 and n-1
		return (int) (r * n);
		
		/* We can choose to write directly :
			return (int) (Math.random() * n); */
	    
    }
}