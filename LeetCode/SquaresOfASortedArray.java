// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

package LeetCode;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] result = nums;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) Math.pow(nums[i], 2);
        }
        Arrays.sort(nums);
        return result;
    }
}