package leetcode19xx.BuildArrayFromPermutation1920;

public class Solution {
    public int[] buildArray(int[] nums) {
        // Задал длину равной nums
        int[] ans = new int[nums.length];
        //Обойти массив  ans  и записать в него элементы исходя из заданного правила
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        // Возвращаем массив  ans
        return ans;
    }
}
