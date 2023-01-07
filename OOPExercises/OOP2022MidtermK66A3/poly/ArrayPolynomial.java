package com.poly;

/**
 * Class representing a polynomial with coefficients stored as on array of int
 */
public class ArrayPolynomial extends AbstractPolynomial {
    private double[] coefficients;

    public ArrayPolynomial(double[] coefficients) {
        /* TODO */
    }

    private void reduce() {
        /* TODO */
    }

    @Override
    public IPolynomial derivative() {
        /* TODO */
    }

    @Override
    public IPolynomial integral() {
        /* TODO */
    }

    @Override
    public double coefficient(int degree) {
        /* TODO */
    }

    @Override
    public double[] coefficients() {
        /* TODO */
    }

    public String type() {
        return "Array Poly";
    }

    public ArrayPolynomial plus(ArrayPolynomial that) {
        /* TODO */
    }

    public ArrayPolynomial minus(ArrayPolynomial that) {
        /* TODO */
    }

    public ArrayPolynomial times(ArrayPolynomial that) {
        /* TODO */
    }
}
