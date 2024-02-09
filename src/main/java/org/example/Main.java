package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Scientific Calculator Menu:");
            System.out.println("1. Square root function - √x");
            System.out.println("2. Factorial function - x!");
            System.out.println("3. Natural logarithm (base е) - ln(x)");
            System.out.println("4. Power function - x^b");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to find its square root: ");
                    double numberSqrt = scanner.nextDouble();
                    double resultSqrt = Math.sqrt(numberSqrt);
                    System.out.println("Square root of " + numberSqrt + " is " + resultSqrt);
                    break;
                case 2:
                    System.out.print("Enter a number to find its factorial: ");
                    int numberFact = scanner.nextInt();
                    int resultFact = factorial(numberFact);
                    System.out.println("Factorial of " + numberFact + " is " + resultFact);
                    break;
                case 3:
                    System.out.print("Enter a number to find its natural logarithm: ");
                    double numberLog = scanner.nextDouble();
                    double resultLog = Math.log(numberLog);
                    System.out.println("Natural logarithm of " + numberLog + " is " + resultLog);
                    break;
                case 4:
                    System.out.print("Enter base (x) value: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent (b) value: ");
                    double exponent = scanner.nextDouble();
                    double resultPower = Math.pow(base, exponent);
                    System.out.println(base + " raised to the power " + exponent + " is " + resultPower);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        }
    }

    private static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
