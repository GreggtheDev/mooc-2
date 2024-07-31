package org.example;

public class Calculator {

    // Calculates the factorial of a given non-negative number
    public int factorial(int n) {
        // Check if the parameter n is negative
        if (n < 0) {
            // If n is negative, throw an IllegalArgumentException with a descriptive message
            throw new IllegalArgumentException("Parameter must be non-negative.");
        }
        // Initialize the result to 1 (factorial of 0 is 1)
        int result = 1;
        // Compute the factorial by multiplying all integers from 1 to n
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        // Return the computed factorial
        return result;
    }

    // Calculates the binomial coefficient (n choose k)
    public int binomialCoefficient(int n, int k) {
        // Check if n or k are negative, or if k is greater than n
        if (n < 0 || k < 0 || k > n) {
            // If any condition is not met, throw an IllegalArgumentException with a descriptive message
            throw new IllegalArgumentException("Parameters must be non-negative and the subset size (k) must not exceed the set size (n).");
        }
        // Use the factorial method to calculate the binomial coefficient
        return factorial(n) / (factorial(k) * factorial(n - k));
    }
}
