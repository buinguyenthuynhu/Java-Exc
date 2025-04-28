// Two sum II - Two pointers

import java.util.Arrays;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sorting number array (commas for seperation): ");
        String inputArrayString = scanner.nextLine();
        String[] numbers = inputArrayString.split(",");
        int[] nums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = Integer.parseInt(numbers[i].trim());
        }

        System.out.print("Enter target: ");
        int target = scanner.nextInt();

        int[] result = twoSum(nums, target);

        System.out.println("Output: " + Arrays.toString(result));

        scanner.close();
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[] {left + 1, right + 1}; // Index
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[] {-1, -1}; // Edge case
    }
}