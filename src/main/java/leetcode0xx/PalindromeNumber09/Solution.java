package leetcode0xx.PalindromeNumber09;

/**
 * Given an integer x, return true if x is palindrome integer.
 * An integer is a palindrome when it reads the same backward as forward.
 * For example, 121 is a palindrome while 123 is not.
 * Example 1:
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * <p>
 * Example 2:
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * <p>
 * Example 3:
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int count = String.valueOf(x).length();
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = x % 10;
            x /= 10;
        }

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(11));
    }
}
