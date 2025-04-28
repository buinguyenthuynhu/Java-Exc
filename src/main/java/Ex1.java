// Remove Vowels

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        String input = scanner.nextLine();

        String result = input.replaceAll("(?i)[aeiou]", ""); // Replace all both uppercase and lowercase

        System.out.println("Output: " + result);

        scanner.close();
    }
}

