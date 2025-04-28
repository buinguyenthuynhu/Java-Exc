// Count Words

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        String input = scanner.nextLine();

        String[] words = input.trim().split("\\s+");
        int count = (input.isEmpty()) ? 0 : words.length;

        System.out.println("Output: " + count);

        scanner.close();
    }
}
