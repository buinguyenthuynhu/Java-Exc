// Tax Calculator
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter income (mils): ");
            double income = scanner.nextDouble();
            double taxRate;

            if (income <= 5) {
                taxRate = 0.05;
            } else if (income <= 10) {
                taxRate = 0.10;
            } else if (income <= 18) {
                taxRate = 0.15;
            } else if (income <= 32) {
                taxRate = 0.20;
            } else if (income <= 52) {
                taxRate = 0.25;
            } else if (income <= 80) {
                taxRate = 0.30;
            } else {
                taxRate = 0.35;
            }

            double tax = income * taxRate;

            System.out.println("Tax is: " + tax + " mils VND");

        } catch (InputMismatchException e) {
            System.out.println("Pls enter number");
        }

        scanner.close();
    }
}
