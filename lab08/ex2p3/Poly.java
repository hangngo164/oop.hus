package oop.lab08.ex2p3;
public interface Poly {
    public double[] coefficients();

    public double coefficient(int degree);

    public int degree();

    public Poly derivative();
}
