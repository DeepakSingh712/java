package PracticalQuetions;
 /*1.Create a Java program that acts as a simple calculator.
        ● The program should prompt the user to enter two numbers and an operator (+, -,).
        ● Perform the corresponding calculation based on the operator.
        ● Handle potential exceptions, such as division by zero or invalid operator input.
        ● Display the result or an appropriate error message.*/


import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        char operator = ' ';

        try {
            System.out.print("Enter the first number: ");
            num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            num2 = scanner.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            operator = scanner.next().charAt(0);

            double result = 0;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero.");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator.");
            }

            System.out.println("Result: " + result);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}


