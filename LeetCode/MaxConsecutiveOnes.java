// Given a binary array nums, return the maximum number of consecutive 1's in the array.

package LeetCode;

import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int j = 0, result = 0;
        for (int i : nums) {
            if (i == 0) {
                j = 0;
                continue;
            }
            j++;
            result = Math.max(j, result);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the size of the array");
        int n = input.nextInt();
        int[] binaryArray = new int[n];

        System.out.print("Please enter the binary array");
        for (int i : binaryArray) {
            binaryArray[i] = input.nextInt();
        }
        input.close();
        System.out.printf("Max Consecutive 1s is: %d", findMaxConsecutiveOnes(binaryArray));
    }
}