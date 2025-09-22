// Calculator.java
// A simple calculator program that performs basic arithmetic operations
// using methods for addition, subtraction, multiplication, and division.

import java.util.Scanner;

public class Calculator {

    // Method to add two numbers
    public static double add(double a, double b) {
        return a + b;
    }

    // Method to subtract two numbers
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method to multiply two numbers
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method to divide two numbers (with division by zero check)
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0; // Return zero to handle gracefully
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        System.out.println("=== Welcome to the Simple Calculator ===");

        while (continueCalculation) {
            // Taking user input
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            char operator;
            double result = 0;
            boolean validOperator = false;

            // Keep asking until user enters a valid operator
            do {
                System.out.print("Choose operation (+, -, *, /): ");
                operator = scanner.next().charAt(0);

                switch (operator) {
                    case '+':
                        result = add(num1, num2);
                        validOperator = true;
                        break;
                    case '-':
                        result = subtract(num1, num2);
                        validOperator = true;
                        break;
                    case '*':
                        result = multiply(num1, num2);
                        validOperator = true;
                        break;
                    case '/':
                        result = divide(num1, num2);
                        validOperator = true;
                        break;
                    default:
                        System.out.println("Invalid operator! Please try again.");
                }
            } while (!validOperator);

            // Display result
            System.out.println("Result: " + result);

            // Ask if user wants another calculation
            System.out.print("Do you want to perform another calculation? (y/n): ");
            char choice = scanner.next().charAt(0);
            if (choice == 'n' || choice == 'N') {
                continueCalculation = false;
            }
        }

        System.out.println("Thank you for using the calculator!");
        scanner.close();
    }
}

/*
Sample Input/Output:

=== Welcome to the Simple Calculator ===
Enter first number: 12
Enter second number: 4
Choose operation (+, -, *, /): *
Result: 48.0
Do you want to perform another calculation? (y/n): y

Enter first number: 10
Enter second number: 0
Choose operation (+, -, *, /): /
Error: Cannot divide by zero.
Result: 0.0
Do you want to perform another calculation? (y/n): n

Thank you for using the calculator!
*/
