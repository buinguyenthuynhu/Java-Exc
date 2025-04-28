// Minimum Window Substring - Sliding window

import java.util.HashMap;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("String s: ");
        String s = scanner.nextLine();

        System.out.print("String t: ");
        String t = scanner.nextLine();

        String result = minWindow(s, t);

        System.out.println("Output: " + result);

        scanner.close();
    }

    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.isEmpty() || t.isEmpty()) {
            return "";
        }

        // Req
        HashMap<Character, Integer> targetMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int right = 0;
        int count = targetMap.size(); // Count unique
        int minLength = Integer.MAX_VALUE;
        int minLeft = 0;

        while (right < s.length()) {
            char rightChar = s.charAt(right);

            // If current char in t
            if (targetMap.containsKey(rightChar)) {
                targetMap.put(rightChar, targetMap.get(rightChar) - 1);
                if (targetMap.get(rightChar) == 0) {
                    count--;
                }
            }
            right++;

            // Valid
            while (count == 0) {
                // Update
                if (right - left < minLength) {
                    minLength = right - left;
                    minLeft = left;
                }

                // Next
                char leftChar = s.charAt(left);
                if (targetMap.containsKey(leftChar)) {
                    targetMap.put(leftChar, targetMap.get(leftChar) + 1);
                    if (targetMap.get(leftChar) > 0) {
                        count++;
                    }
                }
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLength);
    }
}