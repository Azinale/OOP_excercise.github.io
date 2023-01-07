public class ConvertUnit1{
	public static void main(String[] args){
		Double x = Double.parseDouble(args [0]);
		Double y = x*39.3700787;
		System.out.println(Math.round(y*100.0)/100.0);
	}

}