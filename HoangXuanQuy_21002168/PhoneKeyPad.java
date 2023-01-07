import java.util.Scanner;
public class PhoneKeyPad {
		// TODO Auto-generated method stub
    public static void nested_if ( String inStr) {
      for (int i = 0; i < inStr.length(); i++) {
    	  if(inStr.charAt(i) == 'a' || inStr.charAt(i) == 'b' || inStr.charAt(i) == 'c' ) {
    		 System.out.print(2); 
    	  } else if (inStr.charAt(i) == 'd' || inStr.charAt(i) == 'e' || inStr.charAt(i) == 'f' ) {
    		 System.out.print(3);
    	  } else if(inStr.charAt(i) == 'g' || inStr.charAt(i) == 'h' || inStr.charAt(i) == 'i' ) {
    		  System.out.print(4);
    	  } else if (inStr.charAt(i) == 'j' || inStr.charAt(i) == 'k' || inStr.charAt(i) == 'l' ) { 
    		  System.out.print(5); 
    	  } else if (inStr.charAt(i) == 'm' || inStr.charAt(i) == 'n' || inStr.charAt(i) == 'o' ) {
    		  System.out.print(6);
    	  } else if (inStr.charAt(i) == 'p' || inStr.charAt(i) == 'q' || inStr.charAt(i) == 'r'
    			  || inStr.charAt(i) == 's') {
    		  System.out.print(7);
    	  } else if (inStr.charAt(i) == 't' || inStr.charAt(i) == 'u' || inStr.charAt(i) == 'v' ) {
    		  System.out.print(8);
    	  } else if (inStr.charAt(i) == 'w' || inStr.charAt(i) == 'x' || inStr.charAt(i) == 'y'
    			  || inStr.charAt(i) == 'z') {
    		  System.out.print(9);
    	  }
      }
    }
    public static void switch_case ( String inStr ) {
      for (int i = 0; i < inStr.length(); i++) {
    	  switch (inStr.charAt(i)) {
    	    case 'a' :
    	    case 'b' :
    	    case 'c' :
    	      System.out.print(2);
    	      break;
    	    case 'd' :
    	    case 'e' :
    	    case 'f' :
    	      System.out.print(3);
    	      break;  
    	    case 'g' :
    	    case 'h' :
    	    case 'i' :
    	      System.out.print(4);
    	      break;  
    	    case 'j' :
    	    case 'k' :
    	    case 'l' :
    	      System.out.print(5);
    	      break;
    	    case 'm' :
    	    case 'n' :
    	    case '0' :
    	      System.out.print(6);
    	      break;
    	    case 'p' :
    	    case 'q' :
    	    case 'r' :
    	    case 's' :
    	      System.out.print(7);
    	      break;
    	    case 't' :
    	    case 'u' :
    	    case 'v' :
    	      System.out.print(8);
    	      break;
    	    case 'w' :
    	    case 'x' :
    	    case 'y' :
    	    case 'z' :
    	      System.out.print(9);
    	      break;
    	  }
      }
    }
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String inStr;
		inStr = input.nextLine().toLowerCase();
		nested_if ( inStr );
		System.out.println();
		switch_case ( inStr );
	}

}
