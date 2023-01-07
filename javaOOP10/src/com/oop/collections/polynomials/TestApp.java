package com.oop.collections.polynomials;
public class TestApp {
    public static void main(String[] args){
        Poly ap = new ArrayPoly(new double[]{1,3,4,8});
        Poly lp = new ListPoly(new double[]{1,3,4,8});

        System.out.println("ap = " + ap);
        System.out.println("lp = " + lp);

        System.out.println("----------Test equal------------");

        if(ap.equals(lp) && lp.equals(ap)){
            System.out.println("ap == lp");
        } else {
            System.out.println(" ap != lp");
        }
        System.out.println("----------Test derivative------------");

        ap = ap.derivative();
        System.out.println("ap = " + ap.toString());
        ap = ap.derivative();
        System.out.println("ap = " + ap.toString());

        lp = lp.derivative();
        System.out.println("lp = " + lp.toString());
        lp = lp.derivative();
        System.out.println("lp = " + lp.toString());

        System.out.println("----------Test cof------------");


    }
}

