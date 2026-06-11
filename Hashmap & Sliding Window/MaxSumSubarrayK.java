/*
 * PROBLEM: Maximum Sum Subarray of Size K (Sliding Window)
 * STATEMENT: Aapko ek integer array 'nums' aur ek integer 'k' diya hai. Aapko 'k' size ka ek aisa contiguous subarray (lagatar elements) dhoondna hai jiska sum sabse zyada (maximum) ho, aur woh maximum sum return karna hai. Aapne isme Sliding Window Technique ka use kiya hai jisse har baar naye element ko jodte hain aur pichle element ko hatate hain.
 * EXAMPLE: nums = [2, 1, 1, 1, 3, 2], k = 3
 * Output: 6
 * (Explanation: Size 3 ke alag-alag subarrays ka sum yeh hoga:
 * [2, 1, 1] -> Sum = 4
 * [1, 1, 1] -> Sum = 3
 * [1, 1, 3] -> Sum = 5
 * [1, 3, 2] -> Sum = 6
 * In sabme se sabse zyada sum 6 hai, jo ki subarray [1, 3, 2] ka hai.)
 */

public class MaxSumSubarrayK {
    public static void main(String[] args) {
        int[] nums = {2, 1, 1, 1, 3, 2};
        int k = 3;
        System.out.println ( "Maximum Sum in size of " + k + " element is " + maxSumOfSubarray ( nums, k ) );
    }

    public static int maxSumOfSubarray(int[] nums, int k) {
        int windowSum = 0;
        int maxSum = 0;
        for (int i = 0 ; i < k ; i++) {
            windowSum += nums[i];
        }
        maxSum = windowSum;

        for (int i = k ; i < nums.length ; i++) {
            windowSum += nums[i];
            windowSum -= nums[i - k];
            maxSum = Math.max ( maxSum, windowSum );
        }
        return maxSum;
    }
}
