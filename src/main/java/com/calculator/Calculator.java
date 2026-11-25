
package com.calculator;

public class Calculator {

    public int add(int a, int b) {
        int unusedVariable = 10;
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public void displayMessage() {
        System.out.println("Calculator Application");
        System.out.println("Calculator Application");
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition: " + calc.add(5, 3));
        System.out.println("Subtraction: " + calc.subtract(5, 3));
    }
}
