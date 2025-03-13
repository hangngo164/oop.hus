package oop.lab04.ex1p8;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }
    public int getDegree() {
        return coeffs.length - 1;
    }
    public String toString() {
        StringBuilder str = new StringBuilder();
        for(int i =coeffs.length-1; i >=0; i--) {
            if(i ==0) {
                str.append(coeffs[i]);
                continue;
            }
            if(i ==1){
                str.append(coeffs[i]).append("x").append("+");
                continue;
            }
            str.append(coeffs[i]).append("x^").append(i).append("+");
        }
        return str.toString();
    }
    public double evaluate(double x) {
        double sum = 0;
        for(int i = coeffs.length-1; i >=0; i--) {
            sum = sum * x + coeffs[i];
        }
        return sum;
    }
    public MyPolynomial add(MyPolynomial right) {
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        double[] newCoeffs = new double[maxDegree + 1];
        for(int i = 0; i <= maxDegree; i++) {
            double thisCoeff = 0;
            if(i <= this.getDegree()) {
                thisCoeff = this.coeffs[i];
            }
            double anotherCoeff = 0;
            if(i <= right.getDegree()) {
                anotherCoeff = right.coeffs[i];
            }
            newCoeffs[i] = thisCoeff + anotherCoeff;
        }
        return new MyPolynomial(newCoeffs);
    }
    public MyPolynomial multiply(MyPolynomial right) {
        int newDegree = this.getDegree() + right.getDegree();
        double[] newCoeffs = new double[newDegree + 1];
        for(int i = 0; i < this.getDegree(); i++) {
            for(int j = 0; j < right.getDegree(); j++) {
                newCoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        return new MyPolynomial(newCoeffs);
    }
}
