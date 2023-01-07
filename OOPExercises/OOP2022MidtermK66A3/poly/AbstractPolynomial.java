package com.poly;

public abstract class AbstractPolynomial implements IPolynomial {
    protected int degree;

    @Override
    public int degree() {
        /* TODO */
    }

    public double[] differentiate() {
        /* TODO */
    }

    // Hằng số trong phép tính tích phân mặc định là 1
    public double[] integrate() {
        /* TODO */
    }

    @Override
    public boolean equals(Object o) {
        /* TODO */
    }

    @Override
    public String toString() {
        /* TODO */
    }

    @Override
    public double evaluate(double x) {
        /* TODO */
    }
}
