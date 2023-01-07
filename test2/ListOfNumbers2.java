import java.util.*;

public class ListOfNumbers2 {

	public static void inputList(int[] elems, int size) {
		Scanner sc = new Scanner(System.in);
			if( size <= elems.length) {
				for(int i = 0; i < size; i++) {
				elems[i] = sc.nextInt();
			}
		}	
	}

	public static void printList(int[] elems, int size) {
		if(size <= elems.length) {
			for(int i = 0; i < size; i++) {
				System.out.print(elems[i]);
			}
		}
	}

	public static int indexOf(int[] elems, int size, int value) {
		if( size <= elems.length) {
			for(int i = 0; i < size; i++) {
				if( elems[i] == value ) {
					return i;
				}
			}
		}
		return -1;
	}

	public static void replace(int[] elems, int size, int oldValue, int newValue) {
		if(size <= elems.length) {	
			for(int i = 0; i < size; i++) {
				if( elems[i] == oldValue) {
					elems[i] = newValue;
				}
			}
		}	
	}

	public static int add(int[] elems, int size, int idx, int value) {
		int n = 0;
        int n1;
        if( idx > size ) {
        	idx = size/2;
        }
        for (int i=0; i<size+1; i++) {
            if( i != idx ) {
	            if (i < idx) {
	                continue;
	            }	else if(i > idx) {
	            	n1 = elems[i];
	            	elems[i] = n;
	            	n = n1;
	            }
	        }	else if(i == idx) {
	        	n = elems[i];
	        	elems[i] = value;
	        }
        }
        size++;
        return size;
	}

	public static int remove(int[] elems, int size, int value) {
		int n = 0;
		int x = indexOf(elems, size, value);
		if(size <= elems.length) {	
			if(indexOf(elems, size, value) > -1) {
				for( int i = 0; i < size; i++ ) {
					if(i < x)	{
						continue;
					}	else if(i > x) {
						n = elems[i];
						elems[i-1] = n;
					}
				}
				size -= 1;			
			}else if(x == -1) {
				return size;
			}
		}
		return size;

	}

}
