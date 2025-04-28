// Palindrome - Two pointers

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        String input = scanner.nextLine();

        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();
        boolean isPalindrome = true;

        int left = 0;
        int right = cleanInput.length() - 1;

        while (left < right) {
            if (cleanInput.charAt(left) != cleanInput.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println("Output: " + isPalindrome);

        scanner.close();
    }
}
