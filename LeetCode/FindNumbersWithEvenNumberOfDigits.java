// Given an array nums of integers, return how many of them contain an even number of digits.

package LeetCode;

public class FindNumbersWithEvenNumberOfDigits {
    public static int findNumbers(int[] nums) {
        int result = 0;
        for (int i : nums) {
            if (NoOfDigits(i) % 2 == 0) {
                result++;
            }
        }
        return result;
    }

    public static int NoOfDigits(int n, int result) {
        if (n < 10) {
            return result + 1;
        }
        return NoOfDigits(n / 10, result + 1);
    }

    public static int NoOfDigits(int n) {
        return NoOfDigits(n, 0);
    }

    public static void main(String[] args) {
        int[] myArray = { 12, 345, 2, 6, 7896 };
        System.out.printf("%d", findNumbers(myArray));
    }
}
