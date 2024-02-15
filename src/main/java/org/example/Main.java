package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            logger.info("Scientific Calculator Menu:");
            logger.info("1. Square root function - √x");
            logger.info("2. Factorial function - x!");
            logger.info("3. Natural logarithm (base е) - ln(x)");
            logger.info("4. Power function - x^b");
            logger.info("5. Exit");
            logger.info("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    logger.info("Enter a number to find its square root: ");
                    double numberSqrt = scanner.nextDouble();
                    double resultSqrt = calculateSquareRoot(numberSqrt);
                    logger.info("Square root of " + numberSqrt + " is " + resultSqrt);
                    break;
                case 2:
                    logger.info("Enter a number to find its factorial: ");
                    int numberFact = scanner.nextInt();
                    int resultFact = calculateFactorial(numberFact);
                    logger.info("Factorial of " + numberFact + " is " + resultFact);
                    break;
                case 3:
                    logger.info("Enter a number to find its natural logarithm: ");
                    double numberLog = scanner.nextDouble();
                    double resultLog = calculateNaturalLogarithm(numberLog);
                    logger.info("Natural logarithm of " + numberLog + " is " + resultLog);
                    break;
                case 4:
                    logger.info("Enter base (x) value: ");
                    double base = scanner.nextDouble();
                    logger.info("Enter exponent (b) value: ");
                    double exponent = scanner.nextDouble();
                    double resultPower = calculatePowerFunction(base, exponent);
                    logger.info(base + " raised to the power " + exponent + " is " + resultPower);
                    break;
                case 5:
                    logger.info("Exiting...");
                    System.exit(0);
                default:
                    logger.info("Invalid choice! Please enter a number between 1 and 5.");
            }
        }
    }

    public static double calculateSquareRoot(double number) {
        logger.info("Executing calculateSquareRoot function!");
        return Math.sqrt(number);
    }

    public static int calculateFactorial(int n) {
        if (n == 0){
            logger.info("Executing calculateFactorial function!");
            return 1;}
        else
            return n * calculateFactorial(n - 1);
    }

    public static double calculateNaturalLogarithm(double number) {
        logger.info("Executing calculateNaturalLogarithm function!");
        return Math.log(number);

    }

    public static double calculatePowerFunction(double base, double exponent) {
        logger.info("Executing calculatePowerFunction function!");
        return Math.pow(base, exponent);
    }
}
