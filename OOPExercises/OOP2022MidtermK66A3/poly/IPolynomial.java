package com.poly;

/**
 * Interface representing a polynomial with arbitrary grade
 */
public interface IPolynomial {
    int degree();
    IPolynomial derivative();
    IPolynomial integral();
    double coefficient(int degree);
    double[] coefficients();
    double evaluate(double x);
}

