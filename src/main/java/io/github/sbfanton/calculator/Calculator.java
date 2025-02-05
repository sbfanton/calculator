package io.github.sbfanton.calculator;

/**
 * This class represents a basic calculator with arithmetic operations.
 */
public class Calculator {

    /**
     * Performs the addition of two numbers.
     * 
     * @param a The first number to add.
     * @param b The second number to add.
     * @return The result of adding a and b.
     */
    public static double add(double a, double b) {
        return a + b;
    }

    /**
     * Performs the subtraction of two numbers.
     * 
     * @param a The number to subtract from.
     * @param b The number to subtract.
     * @return The result of subtracting b from a.
     */
    public static double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Performs the multiplication of two numbers.
     * 
     * @param a The first number.
     * @param b The second number.
     * @return The result of multiplying a and b.
     */
    public static double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Performs the division of two numbers. If the divisor is 0, it returns NaN.
     * 
     * @param a The dividend.
     * @param b The divisor.
     * @return The result of dividing a by b, or NaN if b is 0.
     */
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero.");
            return Double.NaN;  // Returns NaN (Not a Number) in case of division by zero
        }
        return a / b;
    }
}

