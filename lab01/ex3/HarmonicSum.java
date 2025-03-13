package oop.lab01.ex3;

public class HarmonicSum {
    public static void main(String[] args){
        int MAX_DENOMINATOR = 50000;
        double sumL2R = getSumL2R(MAX_DENOMINATOR);
        double sumR2L = getSumR2L(MAX_DENOMINATOR);
        double absDiff;
        if(sumL2R > sumR2L){
            absDiff =sumL2R - sumR2L;
        }else{
            absDiff = sumR2L - sumL2R;
        }
        System.out.println("Sum from left-to-right is: " + sumL2R);
        System.out.println("Sum from right-to-left is: " + sumR2L);
        System.out.println("Absolute difference between two sums is " + absDiff);
    }
    public static double getSumL2R(int n){
        double sum = 0.0;
        for(int denominator = 1; denominator <= n; denominator++){
            sum += 1.0 / denominator;
        }
        return sum;
    }
    public static double getSumR2L(int n){
        double sum = 0.0;
        for(int denominator = n; denominator >=1; denominator--){
            sum += 1.0 / denominator;
        }
        return sum;
    }
}
