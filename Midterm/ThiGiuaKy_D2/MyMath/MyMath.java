package com.MyMath;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class MyMath {

    public MyMath() {
    }

    static double cos(double x) {

        x = x % (2 * Math.PI);

        double term = 1.0;
        double sum = 0.0;

        for (int i = 1; term != 0.0; i++) {
            term *= (x / i);
            if (i % 4 == 1) sum += term;
            if (i % 4 == 3) sum -= term;
        }
        return Math.sqrt((1 - Math.pow(sum, 2)));
    }

    static double cosLib(double x) {
        return Math.cos(x);
    }

    static public double exp(double x, int n) {
        double sum = 0.0;
        double term = 1.0;
        for (int i = 1; sum != sum + term; i++) {
            sum = sum + term;
            term = term * x / i;
        }
        return sum;
    }

    static double expLib(double x) {
        return Math.exp(x);
    }

    public static int toDecimal(String number, int inRadix) {
        inRadix = 16;
        int decimal = Integer.parseInt(number);

        if (inRadix == 0) {
            System.out.println(decimal + Integer.parseInt(number));
            return Integer.parseInt(number);
        }

        decimal = decimal * inRadix + toDecimal(number, inRadix);

        return decimal;
    }


    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("MyMath21002168.txt");
        //test cos and cos with java library function
        System.out.println("------------------------------" +
                "");
        double x = Math.PI;
        int n = 5;
        PrintWriter out = new PrintWriter("MyMath21002168.txt");
        System.out.println((cos(x) * 1000000) / 1000000.00);
        System.out.println(cosLib(x));

        //test e^x
        DecimalFormat df = new DecimalFormat("0.######");
        System.out.println(df.format(exp(x, n)));
        System.out.println(df.format(expLib(x)));

        //result of e^2.2*cos(3.3) =
        System.out.println(df.format(exp(2.2, 7) * ((cos(3.3) * 1000000) / 1000000.00)));
        out.print(df.format(exp(2.2, 7) * ((cos(3.3) * 1000000) / 1000000.00)));


        //test toDecimal
    }
}
