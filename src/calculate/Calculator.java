package calculate;
/**
 * programme 1
 * Write a java program using the following descriptions
 * 1. Create one package with name calculate
 * 2. Create two class with name “Calculator” and “Main”
 * 3. Create four methods with manes “addition”, “subtraction”, “division”,
 * and “multiplication”. All methods are instance methods and it doesn’t
 * return anything. But it has two parameters with the names “int a” and
 * “int b”. Also each method has System.out.println(). This prints the
 * result. Also create one more method with the name “calculateResult”
 * with three parameters with name int a, int b and char symbol. Write the
 * logic in the calculateResult method that when the user enters first
 * number and second number and symbol based on symbol it does
 * calculate.
 */

public class Calculator {
    // Method for addition
    public void addition(int a, int b) {
        System.out.println("Addition of " + a + " and " + b + " is: " + (a + b)); // Printing result
    }
    // Method for subtraction
    public void subtraction(int a, int b) {
        System.out.println("Subtraction of " + a + " and " + b + " is: " + (a - b)); // Printing result
    }
    // Method for multiplication
    public void multiplication(int a, int b) {
        System.out.println("Multiplication of " + a + " and " + b + " is: " + (a * b)); // Printing result
    }
    // Method for division
    public void division(int a, int b) {
        if (b != 0) { // Check if denominator is not zero
            System.out.println("Division of " + a + " and " + b + " is: " + (a / b)); // Printing result
        } else {
            System.out.println("Cannot divide by zero."); // Error message if division by zero
        }
    }

    // Method to calculate result based on symbol
    public void calculateResult(int a, int b, char symbol) {
        if (symbol == '+') {
            System.out.println(a + "+" + b + "=" + (a + b));
        } else if (symbol == '-') {
            System.out.println(a + "-" + b + "=" + (a - b));
        } else if (symbol == '/') {
            System.out.println(a + "/" + b + "=" + (a / b));
        } else if (symbol == '*') {
            System.out.println(a + "*" + b + "=" + (a * b));
        } else {
            System.out.println("Please enter correct symbol");
        }

    }

}
