package oop.lab04.ex1p7;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        real = 0.0;
        imag = 0.0;
    }
    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public double getReal() {
        return real;
    }
    public void setReal(double real) {
        this.real = real;
    }
    public double getImag() {
        return imag;
    }
    public void setImag(double imag) {
        this.imag = imag;
    }
    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public String toString() {
        if (imag == 0) {
            return String.format("%.1f", real);
        } else if (real == 0) {
            return String.format("%.1fi", imag);
        } else if (imag > 0) {
            return String.format("%.1f + %.1fi", real, imag);
        } else {
            return String.format("%.1f - %.1fi", real, -imag);
        }
    }
    public boolean isReal(){
        return (imag ==0);
    }
    public boolean isImag() {
        return (real == 0);
    }
    public boolean equals( double real, double imag) {
        return (this.real == real && this.imag == imag);
    }
    public boolean equals(MyComplex another){
        return (this.real == another.getReal() && this.imag == another.getImag());
    }
    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }
    public MyComplex add(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }
    public MyComplex subtract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }
    public MyComplex addNew(MyComplex right) {
       return new MyComplex(this.real + right.real, this.imag + right.imag);
    }
    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(this.real - right.real, this.imag - right.imag);
    }
    public double argument() {
           return Math.atan2(imag, real);
    }
    public MyComplex multiply(MyComplex right) {
        double real = this.real * right.real - this.imag * right.imag;
        double imag = this.real * right.imag + this.imag * right.real;
        return new MyComplex(real, imag);
    }
    public MyComplex divide(MyComplex right) {
        double denominator = right.real * right.real + right.imag * right.imag;
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero (denominator is 0).");
        }
        double real = (this.real * right.real + this.imag * right.imag) / denominator;
        double imag = (-this.real * right.imag + this.imag * right.real) / denominator;
        return new MyComplex(real, imag);
    }
    public MyComplex conjugate() {
        return new MyComplex(this.real, -this.imag);
    }
}
