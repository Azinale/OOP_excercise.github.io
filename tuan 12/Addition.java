// Addition program that uses JOptionPane for input and output.
import javax.swing.JOptionPane; // program uses JOptionPane
  
public class Addition{
    public static void main( String args[] ) throws NumberFormatException {
        // obtain user input from JOptionPane input dialogs
		int number1 =0, number2=0;
        try{
        String firstNumber =                                 
           JOptionPane.showInputDialog("Nhap so nguyen thu 1"); 
        String secondNumber =		
           JOptionPane.showInputDialog("Nhap so nguyen thu 2");
        
        // convert String inputs to int values for use in a calculation
        number1 = Integer.parseInt( firstNumber );
        number2 = Integer.parseInt( secondNumber );
 
        }
        catch(NumberFormatException e){
            System.out.println("Xu li khi bat duoc ngoai le");
        }
        
        int sum = number1 + number2; // add numbers
        JOptionPane.showMessageDialog( null, "Tong la " + sum,
                                      "Tong cua 2 so nguyen", JOptionPane.PLAIN_MESSAGE );
        // display result in a JOptionPane message dialog
        
    } // end method main
} // end class Addition
