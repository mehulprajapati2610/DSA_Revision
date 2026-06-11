/*
 * PROBLEM: Maximum Subarray (Kadane's Algorithm)
 * STATEMENT: Aapko ek integer array 'nums' diya hai. Aapko ek aisa contiguous subarray (array ka ek lagatar hissa) dhoondna hai jiska sum sabse zyada (maximum) ho, aur uska sum return karna hai.
 * EXAMPLE: nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
 * Output: 6
 * (Explanation: Sabse zyada sum dene wala subarray [4, -1, 2, 1] hai, jiska sum 4 + (-1) + 2 + 1 = 6 hai.)
 */

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println ( "Maximum Sum : " + subArrayMax ( arr ) );
    }

    public static int subArrayMax(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0 ; i < arr.length ; i++) {
            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
