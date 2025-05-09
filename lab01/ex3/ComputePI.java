package oop.lab01.ex3;

public class ComputePI {
    public static void main(String[] args) {
        int MAX_DENOMINATOR = 1000;
        System.out.printf("Compute PI when max denominator = %d:   %s\n",
                MAX_DENOMINATOR, calculatePIUsingMaxDenominator(MAX_DENOMINATOR));
        int MAX_TERM = 1000;
        System.out.printf("Compute PI when max term = %d:   %s\n",
                MAX_TERM, calculatePIUsingMaxTerm(MAX_TERM));
        int MAX_DENOMINATOR1 = 10000;
        System.out.printf("Compute PI when max denominator = %d:   %s\n",
                MAX_DENOMINATOR1, calculatePIUsingMaxDenominator(MAX_DENOMINATOR));
        int MAX_TERM1 = 10000;
        System.out.printf("Compute PI when max term = %d:   %s\n",
                MAX_TERM1, calculatePIUsingMaxTerm(MAX_TERM));
        int MAX_DENOMINATOR2 = 100000;
        System.out.printf("Compute PI when max denominator = %d:   %s\n",
                MAX_DENOMINATOR2, calculatePIUsingMaxDenominator(MAX_DENOMINATOR));
        int MAX_TERM2 = 100000;
        System.out.printf("Compute PI when max term = %d:   %s\n",
                MAX_TERM2, calculatePIUsingMaxTerm(MAX_TERM));
        int MAX_DENOMINATOR3 = 1000000;
        System.out.printf("Compute PI when max denominator = %d:   %s\n",
                MAX_DENOMINATOR3, calculatePIUsingMaxDenominator(MAX_DENOMINATOR));
        int MAX_TERM3 = 1000000;
        System.out.printf("Compute PI when max term = %d:   %s\n",
                MAX_TERM3, calculatePIUsingMaxTerm(MAX_TERM));
        System.out.printf("Math.PI = %s\nMath.PI / computedPI = %s %%", Math.PI,
                calculatePIUsingMaxTerm(MAX_TERM) / Math.PI * 100);
    }
    public static double calculatePIUsingMaxDenominator(int maxDenominator) {
        double sum = 0.0;
        for (int denominator = 1; denominator <= maxDenominator; denominator += 2) {
            if (denominator % 4 == 1) {
                sum += 1.0 / denominator;
            } else if (denominator % 4 == 3) {
                sum -= 1.0 / denominator;
            }
        }
        return sum * 4;
    }
    public static double calculatePIUsingMaxTerm(int maxTerm) {
        double sum = 0.0;
        for (int term = 1; term <= maxTerm; term++) {
            if (term % 2 == 1) {
                sum += 1.0 / (term * 2 - 1);
            } else {
                sum -= 1.0 / (term * 2 - 1);
            }
        }
        return sum * 4;
    }
}

