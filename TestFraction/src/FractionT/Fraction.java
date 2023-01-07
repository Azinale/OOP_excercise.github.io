package FractionT;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(Fraction fraction) {
        this.numerator = fraction.numerator;
    }

    public Fraction(int numerator) {
        this.numerator = numerator;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    private int gcd(int number1, int number2) {
        while (number2 != 0) {
            int temp = number1 % number2;
            number1 = number2;
            number2 = temp;
        }
        return number1;
    }
    public int lcm(int number1, int number2){
        return (number1/gcd(number1,number2))*number2;
    }

    public String toString(){
        return "Fraction numerator = ["+numerator+"denominator ="+denominator+" ]";
    }
}
