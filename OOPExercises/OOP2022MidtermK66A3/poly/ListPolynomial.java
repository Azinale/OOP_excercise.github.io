package com.poly;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a polynomial with coefficients stored as a list
 */
public class ListPolynomial extends AbstractPolynomial {
    private List<Double> coefficients;

    public ListPolynomial(double[] coefficients) {
        /* TODO */
    }

    private void reduce() {

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
        return "List Poly";
    }

    public ListPolynomial plus(ListPolynomial that) {
        /* TODO */
    }

    public ListPolynomial minus(ListPolynomial that) {
        /* TODO */
    }

    public ListPolynomial times(ListPolynomial that) {
        /* TODO */
    }
}
