// Find Second Largest Number

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;

        try {
            System.out.print("Number of elements: ");
            n = scanner.nextInt();

            if (n < 2) {
                System.out.println("Output: " + Integer.MIN_VALUE);
                scanner.close();
                return; // kết thúc chương trình ngay
            }

            int[] arr = new int[n];

            System.out.println("Enter each element:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int max = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;

            for (int num : arr) {
                if (num > max) {
                    secondMax = max;
                    max = num;
                } else if (num > secondMax && num != max) {
                    secondMax = num;
                }
            }

            System.out.println("Output: " + secondMax);

        } catch (InputMismatchException e) {
            System.out.println("Pls enter interger");
        } finally {
            scanner.close();
        }
    }
}
