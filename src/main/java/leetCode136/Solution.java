package leetCode136;

public class Solution {
    public int singleNumber(int[] nums) {
        int input = 0;
        int result = 0;
        for (int num : nums) {
            result = input ^= num;
        }
        return result;
    }
}
